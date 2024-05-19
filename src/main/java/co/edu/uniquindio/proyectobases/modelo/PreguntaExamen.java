package co.edu.uniquindio.proyectobases.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PREGUNTAS_EXAMENES")
public class PreguntaExamen {
    @EmbeddedId
    private PreguntaExamenId id;

    @MapsId("preguntasIdPregunta")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PREGUNTAS_ID_PREGUNTA", nullable = false)
    @JsonIgnoreProperties("profesoresIdUsuario")
    private Pregunta preguntasIdPregunta;

    @MapsId("examenesIdExamen")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "EXAMENES_ID_EXAMEN", nullable = false)
    @JsonIgnore
    private Examen examenesIdExamen;

    @NotNull
    @Column(name = "PORCENTAJE_PREGUNTA", nullable = false)
    private Long porcentajePregunta;

}