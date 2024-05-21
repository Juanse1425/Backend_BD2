package co.edu.uniquindio.proyectobases.servicios.interfaces;

import co.edu.uniquindio.proyectobases.modelo.Opcion;

import java.util.List;

public interface OpcionServicio {
    public Opcion registrarOpcion(Opcion opcion);
    public void eliminarOpcion(Long id);
    public void actualizarOpcion(Opcion opcion);
    public Object[] obtenerOpcion(Long id);
    public List<Object[]> listarOpciones();
}
