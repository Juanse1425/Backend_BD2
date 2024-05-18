package co.edu.uniquindio.proyectobases.modelo.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

/**
 * DTO for {@link co.edu.uniquindio.proyectobases.modelo.PlanEstudio}
 */
public record PlanEstudioDto(@NotNull @Size(max = 200) String nombre,
                             @NotNull @Size(max = 400) String descripcion,
                             @NotNull Long idCurso) {
}