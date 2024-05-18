package co.edu.uniquindio.proyectobases.servicios.implementaciones;

import co.edu.uniquindio.proyectobases.modelo.Profesor;
import co.edu.uniquindio.proyectobases.repositorios.ProfesorRepository;
import co.edu.uniquindio.proyectobases.servicios.interfaces.ProfesorServicio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProfesorServicioImpl implements ProfesorServicio {
    private ProfesorRepository profesorRepository;
    @Override
    public Profesor crearProfesor(Profesor profesor) throws Exception {
        return profesorRepository.save(profesor);
    }

    @Override
    public Profesor actualizarProfesor(Profesor profesor) throws Exception {
        return null;
    }

    @Override
    public void eliminarProfesor(Long id) throws Exception {

    }

    @Override
    public Profesor obtenerProfesor(Long id) throws Exception {
        return profesorRepository.findById(id).orElse(null);
    }

    @Override
    public List<Profesor> listarProfesores() {
        return null;
    }
}
