package co.edu.uniquindio.proyectobases.modelo.dto;

import jakarta.validation.constraints.NotNull;

public record BancoDto(
        @NotNull Long idTema,
        Long idProfesor
) {
}
