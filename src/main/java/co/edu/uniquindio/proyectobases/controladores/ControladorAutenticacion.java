package co.edu.uniquindio.proyectobases.controladores;

import co.edu.uniquindio.proyectobases.modelo.Estudiante;
import co.edu.uniquindio.proyectobases.modelo.Profesor;
import co.edu.uniquindio.proyectobases.modelo.Usuario;
import co.edu.uniquindio.proyectobases.modelo.dto.LoginDto;
import co.edu.uniquindio.proyectobases.modelo.dto.MensajeDto;
import co.edu.uniquindio.proyectobases.modelo.dto.UsuarioDto;
import co.edu.uniquindio.proyectobases.servicios.implementaciones.EstudianteServicioImpl;
import co.edu.uniquindio.proyectobases.servicios.implementaciones.GrupoServicioImpl;
import co.edu.uniquindio.proyectobases.servicios.implementaciones.ProfesorServicioImpl;
import co.edu.uniquindio.proyectobases.servicios.implementaciones.UsuarioServicioImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/autenticacion")
@RestController
@RequiredArgsConstructor
public class ControladorAutenticacion {
    private final UsuarioServicioImpl usuarioServicioImpl;
    private final EstudianteServicioImpl estudianteServicioImpl;
    private final ProfesorServicioImpl profesorServicioImpl;
    private final GrupoServicioImpl grupoServicioImpl;


    @PostMapping({"/registro"})
    public ResponseEntity<?> crearUsuario(@RequestBody UsuarioDto usuarioDto) {
        Usuario usuario = new Usuario();
        usuario.setId(usuarioDto.id());
        usuario.setNombre(usuarioDto.nombre());
        usuario.setApellido(usuarioDto.apellido());
        usuario.setCorreo(usuarioDto.correo());
        usuario.setContrasena(usuarioDto.contrasena());
        usuario.setRol(usuarioDto.rol());
        try{
            Usuario usuarioCreado = usuarioServicioImpl.crearUsuario(usuario);
            if(usuarioCreado.getRol().equals("Estudiante")){
                Estudiante estudiante = new Estudiante();
                estudiante.setUsuarios(usuarioCreado);
                estudiante.setGruposIdGrupo(grupoServicioImpl.obtenerGrupo(usuarioDto.grupoId()));
                try{
                    estudianteServicioImpl.registrarEstudiante(estudiante);
                    return ResponseEntity.ok().body(new MensajeDto<>("Usuario registrado correctamente", null));
                }catch (Exception e){
                    return ResponseEntity.badRequest().body(new MensajeDto<>(null, e.getMessage()));
                }
            }else{
                Profesor profesor = new Profesor();
                profesor.setUsuarios(usuarioCreado);
                try{
                    profesorServicioImpl.crearProfesor(profesor);
                    return ResponseEntity.ok().body(new MensajeDto<>("Usuario registrado correctamente", null));
                }catch (Exception e){
                    return ResponseEntity.badRequest().body(new MensajeDto<>(null, e.getMessage()));
                }
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MensajeDto<>(null, e.getMessage()));
        }
    }

    @PostMapping({"/login"})
    public ResponseEntity<?> login(@RequestBody LoginDto loginDto) {
        try{
            Usuario usuario = usuarioServicioImpl.login(loginDto.correo(), loginDto.contrasena());
            usuario.setContrasena(null);
            return ResponseEntity.ok().body(new MensajeDto<>(usuario, null));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MensajeDto<>(null, e.getMessage()));
        }
    }
}
