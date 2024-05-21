package co.edu.uniquindio.proyectobases.repositorios;

import co.edu.uniquindio.proyectobases.modelo.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TemaRepository extends JpaRepository<Tema, Long> {
    @Query("SELECT t.id, t.nombre FROM Tema t JOIN Unidad u ON t.unidadesIdUnidad.id = u.id JOIN PlanEstudio p ON u.planEstudiosIdPlan.id = p.id JOIN GrupoCurso gc ON p.cursosCodigo.id = gc.cursosCodigo.id JOIN Grupo g ON gc.gruposIdGrupo.id = g.id WHERE g.id = ?1")
    List<Object[]> obtenerTemasGrupo(Long idGrupo);
}