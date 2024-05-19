package co.edu.uniquindio.proyectobases.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "EXAMENES_PRESENTADOS")
public class ExamenPresentado {
    @Id
    @Column(name = "ID_EXAMEN_PRESENTADO", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "FECHA_PRESENTADO", nullable = false)
    private LocalDate fechaPresentado;

    @NotNull
    @Column(name = "DURACION", nullable = false)
    private Long duracion;

    @NotNull
    @Column(name = "CALIFICACION", nullable = false)
    private Long calificacion;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "EXAMENES_ID_EXAMEN", nullable = false)
    @JsonIgnore
    private Examen examenesIdExamen;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ESTUDIANTES_ID_USUARIO", nullable = false)
    @JsonIgnore
    private Estudiante estudiantesIdUsuario;

    @NotNull
    @Column(name = "HORA_INICIO", nullable = false)
    private LocalDate horaInicio;

}