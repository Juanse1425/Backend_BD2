package co.edu.uniquindio.proyectobases.modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "CURSOS")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "curso_seq_gen")
    @SequenceGenerator(name = "curso_seq_gen", sequenceName = "curso_seq", allocationSize = 1, initialValue = 11)
    @Column(name = "CODIGO", nullable = false)
    private Long id;

    @Size(max = 200)
    @NotNull
    @Column(name = "NOMBRE", nullable = false, length = 200)
    private String nombre;

}