package co.edu.uniquindio.proyectobases.modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TIPOS_PREGUNTAS")
public class TipoPregunta {
    @Id
    @Column(name = "ID_TIPO", nullable = false)
    @NotNull
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tipo_pregunta_seq_gen")
    @SequenceGenerator(name = "tipo_pregunta_seq_gen", sequenceName = "tipo_pregunta_seq", allocationSize = 1)
    private Long id;

    @Size(max = 400)
    @NotNull
    @Column(name = "DESCRIPCION", nullable = false, length = 400)
    private String descripcion;

    @Size(max = 200)
    @NotNull
    @Column(name = "NOMBRE", nullable = false, length = 200)
    private String nombre;

}