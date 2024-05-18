package co.edu.uniquindio.proyectobases.servicios.interfaces;

import co.edu.uniquindio.proyectobases.modelo.Examen;

import java.util.List;

public interface ExamenServicio {
    public Examen crearExamen(Examen examen) throws Exception;
    public Examen actualizarExamen(Examen examen) throws Exception;
    public void eliminarExamen(Long id) throws Exception;
    public Examen obtenerExamen(Long id) throws Exception;
    public List<Examen> listarExamenes();
}
