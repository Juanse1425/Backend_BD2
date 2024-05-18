package co.edu.uniquindio.proyectobases.modelo.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link co.edu.uniquindio.proyectobases.modelo.Usuario}
 */
public record UsuarioDto(@NotNull Long id, @NotNull @Size(max = 200) String nombre, @NotNull @Size(max = 200) String apellido,
                         @NotNull @Size(max = 200) String correo, @NotNull @Size(max = 20) String contrasena,
                         @NotNull @Size(max = 20) String rol, Long grupoId){
}