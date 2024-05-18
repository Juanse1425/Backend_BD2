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
public class GrupoCursoId implements Serializable {
    private static final long serialVersionUID = -7550366985682377764L;
    @NotNull
    @Column(name = "CURSOS_CODIGO", nullable = false)
    private Long cursosCodigo;

    @NotNull
    @Column(name = "GRUPOS_ID_GRUPO", nullable = false)
    private Long gruposIdGrupo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        GrupoCursoId entity = (GrupoCursoId) o;
        return Objects.equals(this.gruposIdGrupo, entity.gruposIdGrupo) &&
                Objects.equals(this.cursosCodigo, entity.cursosCodigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gruposIdGrupo, cursosCodigo);
    }

}