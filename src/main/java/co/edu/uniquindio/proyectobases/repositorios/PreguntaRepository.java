package co.edu.uniquindio.proyectobases.repositorios;

import co.edu.uniquindio.proyectobases.modelo.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PreguntaRepository extends JpaRepository<Pregunta, Long> {
    @Query("SELECT p.id, p.preguntaTexto, p.tiposPreguntasIdTipo.id , p.privacidad, " +
            "LISTAGG(o.id || ':' || o.texto || ':' || o.respuesta, ',') WITHIN GROUP (ORDER BY o.id) AS opciones " +
            "FROM Pregunta p " +
            "JOIN Opcion o ON p.id = o.preguntasIdPregunta.id " +
            "WHERE p.profesoresIdUsuario.id = ?1 AND p.temasIdContenido.id = ?2 AND p.privacidad = 'true' " +
            "GROUP BY p.id, p.preguntaTexto, p.tiposPreguntasIdTipo.id, p.privacidad")
    List<Object[]> obtenerPreguntasPrivadas(Long idProfesor, Long idTema);

    @Query("SELECT p.id, p.preguntaTexto, p.tiposPreguntasIdTipo.id , p.privacidad, " +
            "LISTAGG(o.id || ':' || o.texto || ':' || o.respuesta, ',') WITHIN GROUP (ORDER BY o.id) AS opciones " +
            "FROM Pregunta p " +
            "JOIN Opcion o ON p.id = o.preguntasIdPregunta.id " +
            "WHERE p.temasIdContenido.id = ?1 AND p.privacidad = 'false' " +
            "GROUP BY p.id, p.preguntaTexto, p.tiposPreguntasIdTipo.id, p.privacidad")
    List<Object[]> obtenerPreguntasPublicas(Long idTema);

}