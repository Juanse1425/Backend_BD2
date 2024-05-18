package co.edu.uniquindio.proyectobases.modelo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "RES_EXAM_PRES")
public class ResExamPre {
    @EmbeddedId
    private ResExamPreId id;

    @MapsId("opcionesIdOpcion")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "OPCIONES_ID_OPCION", nullable = false)
    private Opcion opcionesIdOpcion;

    @MapsId("pepPregExamenId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PEP_PREG_EXAMEN_ID", nullable = false)
    private PreguntaExamenPresentado pepPregExamen;

}