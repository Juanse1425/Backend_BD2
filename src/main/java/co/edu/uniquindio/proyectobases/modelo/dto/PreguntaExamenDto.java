package co.edu.uniquindio.proyectobases.modelo.dto;

import jakarta.validation.constraints.NotNull;

public record PreguntaExamenDto(
        @NotNull Long idPregunta,
        @NotNull Long idExamen,
        @NotNull Long porcentajePregunta
) {
}
