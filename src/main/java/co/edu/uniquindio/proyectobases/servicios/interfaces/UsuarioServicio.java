package co.edu.uniquindio.proyectobases.servicios.interfaces;

import co.edu.uniquindio.proyectobases.modelo.Usuario;

import java.util.List;

public interface UsuarioServicio {
    Usuario crearUsuario(Usuario usuario) throws Exception;
    Usuario actualizarUsuario(Usuario usuario) throws Exception;
    void eliminarUsuario(Long id) throws Exception;
    Usuario obtenerUsuario(Long id) throws Exception;
    List<Usuario> listarUsuarios();
}
