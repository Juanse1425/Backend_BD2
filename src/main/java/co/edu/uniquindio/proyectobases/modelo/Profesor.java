package co.edu.uniquindio.proyectobases.modelo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PROFESORES")
public class Profesor {
    @Id
    @Column(name = "PROFESORES_ID_USUARIO", nullable = false)
    private Long id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PROFESORES_ID_USUARIO", nullable = false)
    private Usuario usuarios;

}