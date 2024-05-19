package co.edu.uniquindio.proyectobases.modelo.dto;

import jakarta.validation.constraints.NotNull;
import lombok.NoArgsConstructor;

public record LoginDto(
        @NotNull String correo,
        @NotNull String contrasena
) {
}
