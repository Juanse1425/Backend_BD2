package co.edu.uniquindio.proyectobases.servicios.interfaces;

import co.edu.uniquindio.proyectobases.modelo.Tema;

import java.util.List;

public interface TemaServicio {
    Tema crearTema(Tema tema) throws Exception;
    Tema actualizarTema(Tema tema) throws Exception;
    void eliminarTema(Long id) throws Exception;
    Tema obtenerTema(Long id) throws Exception;
    List<Tema> listarTemas();
}
