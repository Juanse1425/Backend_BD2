package co.edu.uniquindio.proyectobases.servicios.implementaciones;

import co.edu.uniquindio.proyectobases.modelo.Unidad;
import co.edu.uniquindio.proyectobases.repositorios.UnidadRepository;
import co.edu.uniquindio.proyectobases.servicios.interfaces.UnidadServicio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UnidadServicioImpl implements UnidadServicio {
    private final UnidadRepository unidadRepository;
    @Override
    public Unidad crearUnidad(Unidad unidad) {
        return unidadRepository.save(unidad);
    }

    @Override
    public Unidad actualizarUnidad(Unidad unidad) {
        return null;
    }

    @Override
    public void eliminarUnidad(Unidad unidad) {

    }

    @Override
    public Unidad obtenerUnidad(Long id) {
        return unidadRepository.findById(id).orElse(null);
    }

    @Override
    public List<Unidad> listarUnidades() {
        return null;
    }
}
