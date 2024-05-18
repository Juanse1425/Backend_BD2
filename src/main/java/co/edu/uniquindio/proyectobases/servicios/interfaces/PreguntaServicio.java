package co.edu.uniquindio.proyectobases.servicios.interfaces;

import co.edu.uniquindio.proyectobases.modelo.Pregunta;

import java.util.List;

public interface PreguntaServicio {
    Pregunta registrarPregunta(Pregunta pregunta);
    void eliminarPregunta(Long id);
    Pregunta actualizarPregunta(Pregunta pregunta);
    Pregunta obtenerPregunta(Long id);
    List<Pregunta> listarPreguntas();
}
