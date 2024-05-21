package co.edu.uniquindio.proyectobases.servicios.implementaciones;

import co.edu.uniquindio.proyectobases.modelo.TipoPregunta;
import co.edu.uniquindio.proyectobases.repositorios.TipoPreguntaRepository;
import co.edu.uniquindio.proyectobases.servicios.interfaces.TipoPreguntaServicio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TipoPreguntaServicioImpl implements TipoPreguntaServicio {
    private final TipoPreguntaRepository tipoPreguntaRepository;
    @Override
    public TipoPregunta registrarTipoPregunta(TipoPregunta tipoPregunta) {
        return tipoPreguntaRepository.save(tipoPregunta);
    }

    @Override
    public void eliminarTipoPregunta(String tipo) {

    }

    @Override
    public TipoPregunta actualizarTipoPregunta(TipoPregunta tipoPregunta) {
        return null;
    }

    @Override
    public TipoPregunta obtenerTipoPregunta(Long tipo) {
        return tipoPreguntaRepository.findById(tipo).orElse(null);
    }

    @Override
    public List<Object[]> listarTiposPreguntas() {
        return tipoPreguntaRepository.obtenerTiposPreguntas();
    }
}
