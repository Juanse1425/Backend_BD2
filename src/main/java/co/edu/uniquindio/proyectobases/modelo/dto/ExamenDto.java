package co.edu.uniquindio.proyectobases.modelo.dto;

import co.edu.uniquindio.proyectobases.modelo.Examen;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

/**
 * DTO for {@link Examen}
 */
public record ExamenDto(@NotNull @Size(max = 200) String nombre,
                        @NotNull @Size(max = 400) String descripcion,
                        @NotNull Long cantidadTotalPreguntas,
                        @NotNull Long duracion,
                        Long cantidadPreguntas,
                        @NotNull Long idGrupo,
                        @NotNull Long idTema) {
}