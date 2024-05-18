package co.edu.uniquindio.proyectobases.modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PLANES_ESTUDIOS")
public class PlanEstudio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "plan_estudio_seq_gen")
    @SequenceGenerator(name = "plan_estudio_seq_gen", sequenceName = "plan_estudio_seq", allocationSize = 1)
    @Column(name = "ID_PLAN", nullable = false)
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
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CURSOS_CODIGO", nullable = false)
    private Curso cursosCodigo;

}