package co.edu.uniquindio.proyectobases.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "preg_exam_pres_seq_gen")
    @SequenceGenerator(name = "preg_exam_pres_seq_gen", sequenceName = "preg_exam_pres_seq", allocationSize = 1)
    @Column(name = "PREGUNTA_EXAMEN_ID", nullable = false)
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "EXAMENES_PRESENTADOS_ID", nullable = false)
    @JsonIgnoreProperties({"gruposIdGrupo", "temasIdContenido"})
    private ExamenPresentado examenPresentados;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PREGUNTAS_ID_PREGUNTA", nullable = false)
    @JsonIgnoreProperties("profesoresIdUsuario")
    private Pregunta preguntasIdPregunta;

}