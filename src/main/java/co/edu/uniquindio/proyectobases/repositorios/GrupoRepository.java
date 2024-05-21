package co.edu.uniquindio.proyectobases.repositorios;

import co.edu.uniquindio.proyectobases.modelo.Grupo;
import co.edu.uniquindio.proyectobases.modelo.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GrupoRepository extends JpaRepository<Grupo, Long> {
    @Query("SELECT g.id, g.nombre FROM Grupo g")
    List<Object[]> obtenerGrupos();

    @Query("SELECT g.id, g.nombre FROM Grupo g WHERE g.profesoresIdUsuario.id = ?1")
    List<Object[]> obtenerGruposProfesor(Long idProfesor);

}