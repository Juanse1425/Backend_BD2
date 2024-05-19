package co.edu.uniquindio.proyectobases.repositorios;

import co.edu.uniquindio.proyectobases.modelo.PreguntaExamen;
import co.edu.uniquindio.proyectobases.modelo.PreguntaExamenId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreguntaExamenRepository extends JpaRepository<PreguntaExamen, PreguntaExamenId> {
}