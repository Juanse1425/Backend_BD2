package co.edu.uniquindio.proyectobases.servicios.implementaciones;

import co.edu.uniquindio.proyectobases.modelo.Usuario;
import co.edu.uniquindio.proyectobases.repositorios.UsuarioRepository;
import co.edu.uniquindio.proyectobases.servicios.interfaces.UsuarioServicio;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@AllArgsConstructor
@Service
public class UsuarioServicioImpl implements UsuarioServicio {
    private UsuarioRepository usuarioRepository;
    @Override
    public Usuario crearUsuario(Usuario usuario) throws Exception {
        if(usuarioRepository.findById(usuario.getId()).isPresent()) {
            throw new Exception("El usuario ya existe");
        }
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario actualizarUsuario(Usuario usuario) throws Exception {
        return null;
    }

    @Override
    public void eliminarUsuario(Long id) throws Exception {

    }

    @Override
    public Usuario obtenerUsuario(Long id) throws Exception {
        return null;
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return null;
    }

    public Usuario login(String correo, String contrasena) {
        Usuario usuario = usuarioRepository.findByCorreo(correo);
        if(usuario != null && usuario.getContrasena().equals(contrasena)) {
            return usuario;
        }else{
            throw new RuntimeException("Correo o contraseña incorrectos");
        }
    }
}
