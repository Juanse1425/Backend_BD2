package co.edu.uniquindio.proyectobases.servicios.implementaciones;

import co.edu.uniquindio.proyectobases.modelo.Tema;
import co.edu.uniquindio.proyectobases.repositorios.TemaRepository;
import co.edu.uniquindio.proyectobases.servicios.interfaces.TemaServicio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TemaServicioImpl implements TemaServicio {
    private final TemaRepository temaRepository;
    @Override
    public Tema crearTema(Tema tema) throws Exception {
        return temaRepository.save(tema);
    }

    @Override
    public Tema actualizarTema(Tema tema) throws Exception {
        return null;
    }

    @Override
    public void eliminarTema(Long id) throws Exception {

    }

    @Override
    public Tema obtenerTema(Long id) throws Exception {
        return temaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Tema> listarTemas() {
        return null;
    }
}
