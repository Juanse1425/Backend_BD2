package co.edu.uniquindio.proyectobases.servicios.interfaces;

import co.edu.uniquindio.proyectobases.modelo.Estudiante;

import java.util.List;

public interface EstudianteServicio {
    Estudiante registrarEstudiante(Estudiante estudiante);
    Estudiante actualizarEstudiante(Estudiante estudiante);
    void eliminarEstudiante(Estudiante estudiante);
    Estudiante obtenerEstudiante(Long id);
    List<Estudiante> listarEstudiantes();
}
