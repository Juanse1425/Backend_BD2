package co.edu.uniquindio.proyectobases.repositorios;

import co.edu.uniquindio.proyectobases.modelo.TipoPregunta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TipoPreguntaRepository extends JpaRepository<TipoPregunta, Long> {
    @Query("SELECT t.id, t.nombre FROM TipoPregunta t")
    List<Object[]> obtenerTiposPreguntas();
}