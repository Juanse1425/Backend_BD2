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
@Table(name = "GRUPOS")
public class Grupo {
    @Id
    @Column(name = "ID_GRUPO", nullable = false)
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
    @JoinColumn(name = "PROFESORES_ID_USUARIO", nullable = false)
    @JsonIgnore
    private Profesor profesoresIdUsuario;

}