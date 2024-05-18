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
public class PreguntaExamenId implements Serializable {
    private static final long serialVersionUID = 5573556690716964609L;
    @NotNull
    @Column(name = "PREGUNTAS_ID_PREGUNTA", nullable = false)
    private Long preguntasIdPregunta;

    @NotNull
    @Column(name = "EXAMENES_ID_EXAMEN", nullable = false)
    private Long examenesIdExamen;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PreguntaExamenId entity = (PreguntaExamenId) o;
        return Objects.equals(this.examenesIdExamen, entity.examenesIdExamen) &&
                Objects.equals(this.preguntasIdPregunta, entity.preguntasIdPregunta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(examenesIdExamen, preguntasIdPregunta);
    }

}