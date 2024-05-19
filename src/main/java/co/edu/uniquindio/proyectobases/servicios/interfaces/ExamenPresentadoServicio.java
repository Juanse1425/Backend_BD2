package co.edu.uniquindio.proyectobases.servicios.interfaces;

import co.edu.uniquindio.proyectobases.modelo.ExamenPresentado;

import java.util.List;

public interface ExamenPresentadoServicio {
    ExamenPresentado crearExamenPresentado(ExamenPresentado examenPresentado) throws Exception;
    ExamenPresentado actualizarExamenPresentado(ExamenPresentado examenPresentado) throws Exception;
    void eliminarExamenPresentado(ExamenPresentado examenPresentado) throws Exception;
    ExamenPresentado obtenerExamenPresentado(ExamenPresentado examenPresentado) throws Exception;
    List<ExamenPresentado> listarExamenesPresentados();
}
