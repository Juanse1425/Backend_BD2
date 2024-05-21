package co.edu.uniquindio.proyectobases.servicios.interfaces;

import co.edu.uniquindio.proyectobases.modelo.Grupo;

import java.util.List;

public interface GrupoServicio {
    Grupo crearGrupo(Grupo grupo) throws Exception;
    Grupo actualizarGrupo(Grupo grupo) throws Exception;
    void eliminarGrupo(Long id) throws Exception;
    Grupo obtenerGrupo(Long id) throws Exception;
    List<Object[]> listarGrupos();

    List<Object[]> listarGruposProfesor(Long idProfesor);
}
