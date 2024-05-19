package co.edu.uniquindio.proyectobases.servicios.implementaciones;

import co.edu.uniquindio.proyectobases.modelo.PreguntaExamen;
import co.edu.uniquindio.proyectobases.repositorios.PreguntaExamenRepository;
import co.edu.uniquindio.proyectobases.servicios.interfaces.PreguntaExamenServicio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PreguntaExamenServicioImpl implements PreguntaExamenServicio {
    private final PreguntaExamenRepository preguntaExamenRepository;
    @Override
    public PreguntaExamen crearPreguntaExamen(PreguntaExamen preguntaExamen) throws Exception {
        if(preguntaExamenRepository.existsById(preguntaExamen.getId())){
            throw new Exception("La pregunta ya existe");
        }else{
            return preguntaExamenRepository.save(preguntaExamen);
        }

    }

    @Override
    public PreguntaExamen actualizarPreguntaExamen(PreguntaExamen preguntaExamen) throws Exception {
        return null;
    }

    @Override
    public void eliminarPreguntaExamen(PreguntaExamen preguntaExamen) throws Exception {

    }

    @Override
    public PreguntaExamen obtenerPreguntaExamen(PreguntaExamen preguntaExamen) throws Exception {
        return null;
    }

    @Override
    public List<PreguntaExamen> listarPreguntasExamen() {
        return null;
    }
}
