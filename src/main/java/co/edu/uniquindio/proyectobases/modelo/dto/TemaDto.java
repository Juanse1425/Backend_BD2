package co.edu.uniquindio.proyectobases.modelo.dto;

import co.edu.uniquindio.proyectobases.modelo.Tema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

/**
 * DTO for {@link Tema}
 */
public record TemaDto(@NotNull @Size(max = 200) String nombre,
                      @NotNull @Size(max = 400) String descripcion,
                      @NotNull Long idUnidad){
}