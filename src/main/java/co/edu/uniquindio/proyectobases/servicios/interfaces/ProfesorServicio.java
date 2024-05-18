package co.edu.uniquindio.proyectobases.servicios.interfaces;

import co.edu.uniquindio.proyectobases.modelo.Profesor;

import java.util.List;

public interface ProfesorServicio {
    Profesor crearProfesor(Profesor profesor) throws Exception;

    Profesor actualizarProfesor(Profesor profesor) throws Exception;

    void eliminarProfesor(Long id) throws Exception;

    Profesor obtenerProfesor(Long id) throws Exception;

    List<Profesor> listarProfesores();
}
