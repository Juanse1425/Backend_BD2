package co.edu.uniquindio.proyectobases.servicios.interfaces;

import co.edu.uniquindio.proyectobases.modelo.Curso;

import java.util.List;

public interface CursoServicio {
    Curso crearCurso(Curso curso) throws Exception;
    Curso actualizarCurso(Curso curso) throws Exception;
    void eliminarCurso(Long id) throws Exception;
    Curso obtenerCurso(Long id) throws Exception;
    List<Curso> listarCursos();
}
