package co.edu.uniquindio.proyectobases.modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "OPCIONES")
public class Opcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_OPCION", nullable = false)
    private Long id;

    @Size(max = 400)
    @NotNull
    @Column(name = "TEXTO", nullable = false, length = 400)
    private String texto;

    @Size(max = 200)
    @NotNull
    @Column(name = "RESPUESTA", nullable = false, length = 200)
    private String respuesta;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PREGUNTAS_ID_PREGUNTA", nullable = false)
    private Pregunta preguntasIdPregunta;

}