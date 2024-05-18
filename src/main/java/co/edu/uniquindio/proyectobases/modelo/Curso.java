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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CODIGO", nullable = false)
    private Long id;

    @Size(max = 200)
    @NotNull
    @Column(name = "NOMBRE", nullable = false, length = 200)
    private String nombre;

}