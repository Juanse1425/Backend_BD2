package co.edu.uniquindio.proyectobases.servicios.implementaciones;

import co.edu.uniquindio.proyectobases.modelo.ExamenPresentado;
import co.edu.uniquindio.proyectobases.repositorios.ExamenPresentadoRepository;
import co.edu.uniquindio.proyectobases.servicios.interfaces.ExamenPresentadoServicio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ExamenPresentadoServicoImpl implements ExamenPresentadoServicio {
    private final ExamenPresentadoRepository examenPresentadoRepository;

    @Override
    public ExamenPresentado crearExamenPresentado(ExamenPresentado examenPresentado) throws Exception {
        return examenPresentadoRepository.save(examenPresentado);
    }

    @Override
    public ExamenPresentado actualizarExamenPresentado(ExamenPresentado examenPresentado) throws Exception {
        return null;
    }

    @Override
    public void eliminarExamenPresentado(ExamenPresentado examenPresentado) throws Exception {

    }

    @Override
    public ExamenPresentado obtenerExamenPresentado(ExamenPresentado examenPresentado) throws Exception {
        return null;
    }

    @Override
    public List<ExamenPresentado> listarExamenesPresentados() {
        return null;
    }
}
