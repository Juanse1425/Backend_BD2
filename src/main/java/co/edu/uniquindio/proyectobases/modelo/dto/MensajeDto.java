package co.edu.uniquindio.proyectobases.modelo.dto;

public record MensajeDto<T, U>(
        T respuesta,
        U error
) {
}
