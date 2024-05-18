package co.edu.uniquindio.proyectobases.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PREGUNTAS")
public class Pregunta {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pregunta_seq_gen")
    @SequenceGenerator(name = "pregunta_seq_gen", sequenceName = "pregunta_seq", allocationSize = 1)
    @Column(name = "ID_PREGUNTA", nullable = false)
    private Long id;

    @Size(max = 400)
    @NotNull
    @Column(name = "PREGUNTA_TEXTO", nullable = false, length = 400)
    private String preguntaTexto;

    @Size(max = 20)
    @NotNull
    @Column(name = "PRIVACIDAD", nullable = false, length = 20)
    private String privacidad;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PROFESORES_ID_USUARIO", nullable = false)
    @JsonIgnoreProperties("usuarios")
    private Profesor profesoresIdUsuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PREGUNTAS_ID_PREGUNTA")
    @JsonIgnore
    private Pregunta preguntasIdPregunta;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TEMAS_ID_CONTENIDO", nullable = false)
    @JsonIgnoreProperties("unidadesIdUnidad")
    private Tema temasIdContenido;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TIPOS_PREGUNTAS_ID_TIPO", nullable = false)
    private TipoPregunta tiposPreguntasIdTipo;

}