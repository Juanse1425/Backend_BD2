package co.edu.uniquindio.proyectobases.modelo.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

/**
 * DTO for {@link co.edu.uniquindio.proyectobases.modelo.Opcion}
 */
public record OpcionDto(@NotNull @Size(max = 400) String texto,
                        @NotNull @Size(max = 200) String respuesta,
                        @NotNull Long idPregunta){
}