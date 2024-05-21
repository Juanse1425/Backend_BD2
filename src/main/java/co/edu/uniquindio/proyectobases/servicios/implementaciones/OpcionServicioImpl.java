package co.edu.uniquindio.proyectobases.servicios.implementaciones;

import co.edu.uniquindio.proyectobases.modelo.Opcion;
import co.edu.uniquindio.proyectobases.repositorios.OpcionRepository;
import co.edu.uniquindio.proyectobases.servicios.interfaces.OpcionServicio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OpcionServicioImpl implements OpcionServicio {
    private final OpcionRepository opcionRepository;
    @Override
    public Opcion registrarOpcion(Opcion opcion) {
        opcionRepository.save(opcion);
        return opcion;
    }

    @Override
    public void eliminarOpcion(Long id) {

    }

    @Override
    public void actualizarOpcion(Opcion opcion) {

    }

    @Override
    public Object[] obtenerOpcion(Long id) {
        return new Object[0];
    }

    @Override
    public List<Object[]> listarOpciones() {
        return null;
    }
}
