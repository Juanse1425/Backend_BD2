package co.edu.uniquindio.proyectobases.modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "HORARIOS_EXAMENES")
public class HorarioExamen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_HORARIO_EXAMEN", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "FECHA_INICIO", nullable = false)
    private LocalDate fechaInicio;

    @NotNull
    @Column(name = "HORA_INICIO", nullable = false)
    private LocalDate horaInicio;

    @NotNull
    @Column(name = "FECHA_FIN", nullable = false)
    private LocalDate fechaFin;

    @NotNull
    @Column(name = "HORA_FIN", nullable = false)
    private LocalDate horaFin;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "EXAMENES_ID_EXAMEN", nullable = false)
    private Examen examenesIdExamen;

}