package co.edu.uniquindio.proyectobases.servicios.implementaciones;

import co.edu.uniquindio.proyectobases.modelo.Curso;
import co.edu.uniquindio.proyectobases.repositorios.CursoRepository;
import co.edu.uniquindio.proyectobases.servicios.interfaces.CursoServicio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CursoServicioImpl implements CursoServicio {
    private CursoRepository cursoRepository;
    @Override
    public Curso crearCurso(Curso curso) throws Exception {
        return cursoRepository.save(curso);
    }

    @Override
    public Curso actualizarCurso(Curso curso) throws Exception {
        return null;
    }

    @Override
    public void eliminarCurso(Long id) throws Exception {

    }

    @Override
    public Curso obtenerCurso(Long id) throws Exception {
        return cursoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Curso> listarCursos() {
        return null;
    }
}
