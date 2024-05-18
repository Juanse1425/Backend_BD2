package co.edu.uniquindio.proyectobases.servicios.interfaces;

import co.edu.uniquindio.proyectobases.modelo.Unidad;

import java.util.List;

public interface UnidadServicio {
    Unidad crearUnidad(Unidad unidad);
    Unidad actualizarUnidad(Unidad unidad);
    void eliminarUnidad(Unidad unidad);
    Unidad obtenerUnidad(Long id);
    List<Unidad> listarUnidades();
}
