package co.edu.uniquindio.proyectobases.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "EXAMENES")
public class Examen {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "examen_seq_gen")
    @SequenceGenerator(name = "examen_seq_gen", sequenceName = "examen_seq", allocationSize = 1)
    @Column(name = "ID_EXAMEN", nullable = false)
    private Long id;

    @Size(max = 200)
    @NotNull
    @Column(name = "NOMBRE", nullable = false, length = 200)
    private String nombre;

    @Size(max = 400)
    @NotNull
    @Column(name = "DESCRIPCION", nullable = false, length = 400)
    private String descripcion;

    @NotNull
    @Column(name = "CANTIDAD_TOTAL_PREGUNTAS", nullable = false)
    private Long cantidadTotalPreguntas;

    @NotNull
    @Column(name = "DURACION", nullable = false)
    private Long duracion;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "GRUPOS_ID_GRUPO", nullable = false)
    @JsonIgnoreProperties("profesoresIdUsuario")
    private Grupo gruposIdGrupo;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TEMAS_ID_CONTENIDO", nullable = false)
    @JsonIgnoreProperties("unidadesIdUnidad")
    private Tema temasIdContenido;

    @Column(name = "CANTIDAD_PREGUNTAS")
    private Long cantidadPreguntas;

}