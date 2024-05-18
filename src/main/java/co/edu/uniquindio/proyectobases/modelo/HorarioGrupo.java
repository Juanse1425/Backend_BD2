package co.edu.uniquindio.proyectobases.modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "HORARIOS_GRUPOS")
public class HorarioGrupo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_HORARIO_GRUPO", nullable = false)
    private Long id;

    @Size(max = 30)
    @NotNull
    @Column(name = "DIA", nullable = false, length = 30)
    private String dia;

    @NotNull
    @Column(name = "HORA_INICIO", nullable = false)
    private LocalDate horaInicio;

    @Column(name = "HORA_FINAL")
    private LocalDate horaFinal;

    @Size(max = 200)
    @NotNull
    @Column(name = "LUGAR", nullable = false, length = 200)
    private String lugar;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "GRUPOS_ID_GRUPO", nullable = false)
    private Grupo gruposIdGrupo;

}