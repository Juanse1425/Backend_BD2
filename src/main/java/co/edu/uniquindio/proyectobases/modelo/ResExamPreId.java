package co.edu.uniquindio.proyectobases.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class ResExamPreId implements Serializable {
    private static final long serialVersionUID = 5291447648180285441L;
    @NotNull
    @Column(name = "OPCIONES_ID_OPCION", nullable = false)
    private Long opcionesIdOpcion;

    @NotNull
    @Column(name = "PEP_PREG_EXAMEN_ID", nullable = false)
    private Long pepPregExamenId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ResExamPreId entity = (ResExamPreId) o;
        return Objects.equals(this.pepPregExamenId, entity.pepPregExamenId) &&
                Objects.equals(this.opcionesIdOpcion, entity.opcionesIdOpcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pepPregExamenId, opcionesIdOpcion);
    }

}