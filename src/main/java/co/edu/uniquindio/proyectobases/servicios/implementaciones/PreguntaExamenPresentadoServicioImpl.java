package co.edu.uniquindio.proyectobases.servicios.implementaciones;

import co.edu.uniquindio.proyectobases.modelo.PreguntaExamenPresentado;
import co.edu.uniquindio.proyectobases.repositorios.PreguntaExamenPresentadoRepository;
import co.edu.uniquindio.proyectobases.servicios.interfaces.PreguntaExamenPresentadoServicio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PreguntaExamenPresentadoServicioImpl implements PreguntaExamenPresentadoServicio {
    private final PreguntaExamenPresentadoRepository preguntaExamenPresentadoRepository;
    @Override
    public PreguntaExamenPresentado crearPreguntaExamenPresentado(PreguntaExamenPresentado preguntaExamenPresentado) throws Exception {
        return preguntaExamenPresentadoRepository.save(preguntaExamenPresentado);
    }

    @Override
    public PreguntaExamenPresentado actualizarPreguntaExamenPresentado(PreguntaExamenPresentado preguntaExamenPresentado) throws Exception {
        return null;
    }

    @Override
    public void eliminarPreguntaExamenPresentado(PreguntaExamenPresentado preguntaExamenPresentado) throws Exception {

    }

    @Override
    public PreguntaExamenPresentado obtenerPreguntaExamenPresentado(PreguntaExamenPresentado preguntaExamenPresentado) throws Exception {
        return null;
    }

    @Override
    public List<PreguntaExamenPresentado> listarPreguntasExamenPresentado() {
        return null;
    }
}
