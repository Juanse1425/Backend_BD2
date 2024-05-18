package co.edu.uniquindio.proyectobases.modelo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "GRUPOS_CURSOS")
public class GrupoCurso {
    @EmbeddedId
    private GrupoCursoId id;

    @MapsId("cursosCodigo")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CURSOS_CODIGO", nullable = false)
    private Curso cursosCodigo;

    @MapsId("gruposIdGrupo")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "GRUPOS_ID_GRUPO", nullable = false)
    private Grupo gruposIdGrupo;

}