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
@Table(name = "UNIDADES")
public class Unidad {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "unidad_seq_gen")
    @SequenceGenerator(name = "unidad_seq_gen", sequenceName = "unidad_seq", allocationSize = 1)
    @Column(name = "ID_UNIDAD", nullable = false)
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
    @JoinColumn(name = "PLANES_ESTUDIOS_ID_PLAN", nullable = false)
    @JsonIgnoreProperties({"cursosCodigo"})
    private PlanEstudio planEstudiosIdPlan;

}