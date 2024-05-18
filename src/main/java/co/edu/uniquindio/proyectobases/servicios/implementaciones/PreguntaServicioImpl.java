package co.edu.uniquindio.proyectobases.servicios.implementaciones;

import co.edu.uniquindio.proyectobases.modelo.Pregunta;
import co.edu.uniquindio.proyectobases.repositorios.PreguntaRepository;
import co.edu.uniquindio.proyectobases.servicios.interfaces.PreguntaServicio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PreguntaServicioImpl implements PreguntaServicio {
    private final PreguntaRepository preguntaRepository;
    @Override
    public Pregunta registrarPregunta(Pregunta pregunta) {
        return preguntaRepository.save(pregunta);
    }

    @Override
    public void eliminarPregunta(Long id) {

    }

    @Override
    public Pregunta actualizarPregunta(Pregunta pregunta) {
        return null;
    }

    @Override
    public Pregunta obtenerPregunta(Long id) {
        return preguntaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Pregunta> listarPreguntas() {
        return null;
    }
}
