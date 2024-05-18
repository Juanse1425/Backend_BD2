package co.edu.uniquindio.proyectobases.modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ESTUDIANTES")
public class Estudiante {
    @Id
    @Column(name = "ESTUDIANTES_ID_USUARIO", nullable = false)
    private Long id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ESTUDIANTES_ID_USUARIO", nullable = false)
    private Usuario usuarios;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "GRUPOS_ID_GRUPO", nullable = false)
    private Grupo gruposIdGrupo;

}