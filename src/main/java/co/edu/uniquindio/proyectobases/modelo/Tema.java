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
@Table(name = "TEMAS")
public class Tema {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tema_seq_gen")
    @SequenceGenerator(name = "tema_seq_gen", sequenceName = "tema_seq", allocationSize = 1)
    @Column(name = "ID_CONTENIDO", nullable = false)
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
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "UNIDADES_ID_UNIDAD", nullable = false)
    @JsonIgnoreProperties({"planEstudiosIdPlan"})
    private Unidad unidadesIdUnidad;

}