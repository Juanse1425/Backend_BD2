package co.edu.uniquindio.proyectobases.modelo.dto;

import co.edu.uniquindio.proyectobases.modelo.Curso;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Curso}
 */
public record CursoDto(@NotNull @Size(max = 200) String nombre) {
}