package co.edu.uniquindio.proyectobases.repositorios;

import co.edu.uniquindio.proyectobases.modelo.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
    @Query("SELECT ex.id, ex.nombre FROM Estudiante e JOIN Grupo g ON e.gruposIdGrupo.id = g.id JOIN Examen ex ON g.id = ex.gruposIdGrupo.id WHERE e.id = ?1")
    List<Object[]> obtenerExamenesEstudiante(Long idEstudiante);
}