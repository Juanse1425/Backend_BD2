package co.edu.uniquindio.proyectobases.servicios.interfaces;

import co.edu.uniquindio.proyectobases.modelo.PreguntaExamen;

import java.util.List;

public interface PreguntaExamenServicio {
    PreguntaExamen crearPreguntaExamen(PreguntaExamen preguntaExamen) throws Exception;
    PreguntaExamen actualizarPreguntaExamen(PreguntaExamen preguntaExamen) throws Exception;
    void eliminarPreguntaExamen(PreguntaExamen preguntaExamen) throws Exception;
    PreguntaExamen obtenerPreguntaExamen(PreguntaExamen preguntaExamen) throws Exception;
    List<PreguntaExamen> listarPreguntasExamen();
}
