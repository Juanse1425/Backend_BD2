package co.edu.uniquindio.proyectobases.servicios.interfaces;

import co.edu.uniquindio.proyectobases.modelo.PreguntaExamenPresentado;

import java.util.List;

public interface PreguntaExamenPresentadoServicio {
    PreguntaExamenPresentado crearPreguntaExamenPresentado(PreguntaExamenPresentado preguntaExamenPresentado) throws Exception;
    PreguntaExamenPresentado actualizarPreguntaExamenPresentado(PreguntaExamenPresentado preguntaExamenPresentado) throws Exception;
    void eliminarPreguntaExamenPresentado(PreguntaExamenPresentado preguntaExamenPresentado) throws Exception;
    PreguntaExamenPresentado obtenerPreguntaExamenPresentado(PreguntaExamenPresentado preguntaExamenPresentado) throws Exception;
    List<PreguntaExamenPresentado> listarPreguntasExamenPresentado();
}
