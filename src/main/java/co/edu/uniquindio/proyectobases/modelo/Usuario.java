package co.edu.uniquindio.proyectobases.modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "USUARIOS")
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
    @Column(name = "ID_USUARIO", nullable = false)
    private Long id;

    @Size(max = 200)
    @NotNull
    @Column(name = "NOMBRE", nullable = false, length = 200)
    private String nombre;

    @Size(max = 200)
    @NotNull
    @Column(name = "APELLIDO", nullable = false, length = 200)
    private String apellido;

    @Size(max = 200)
    @NotNull
    @Column(name = "CORREO", nullable = false, length = 200)
    private String correo;

    @Size(max = 20)
    @NotNull
    @Column(name = "CONTRASENA", nullable = false, length = 20)
    private String contrasena;

    @Size(max = 20)
    @NotNull
    @Column(name = "ROL", nullable = false, length = 20)
    private String rol;

}