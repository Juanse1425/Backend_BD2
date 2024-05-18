package co.edu.uniquindio.proyectobases.servicios.implementaciones;

import co.edu.uniquindio.proyectobases.modelo.Examen;
import co.edu.uniquindio.proyectobases.repositorios.ExamenRepository;
import co.edu.uniquindio.proyectobases.servicios.interfaces.ExamenServicio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ExamenServicioImpl implements ExamenServicio {
    private final ExamenRepository examenRepository;
    @Override
    public Examen crearExamen(Examen examen) throws Exception {
        return examenRepository.save(examen);
    }

    @Override
    public Examen actualizarExamen(Examen examen) throws Exception {
        return null;
    }

    @Override
    public void eliminarExamen(Long id) throws Exception {

    }

    @Override
    public Examen obtenerExamen(Long id) throws Exception {
        return null;
    }

    @Override
    public List<Examen> listarExamenes() {
        return null;
    }
}
