package co.edu.uniquindio.proyectobases.modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PREGUNTAS_EXAMENES_PRESENTADOS")
public class PreguntaExamenPresentado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PREGUNTA_EXAMEN_ID", nullable = false)
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "EXAMENES_PRESENTADOS_ID", nullable = false)
    private ExamenPresentado examenPresentados;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PREGUNTAS_ID_PREGUNTA", nullable = false)
    private Pregunta preguntasIdPregunta;

}