package co.edu.uniquindio.proyectobases.modelo.dto;

import co.edu.uniquindio.proyectobases.modelo.Pregunta;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

/**
 * DTO for {@link Pregunta}
 */
public record PreguntaDto(@NotNull @Size(max = 400) String preguntaTexto,
                          @NotNull @Size(max = 20) String privacidad,
                          @NotNull Long idProfesor,
                          Long idPreguntaPadre,
                          @NotNull Long idTema,
                          @NotNull Long idTipoPregunta){
}