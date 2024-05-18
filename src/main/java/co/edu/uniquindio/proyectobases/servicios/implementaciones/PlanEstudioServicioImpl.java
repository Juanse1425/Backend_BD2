package co.edu.uniquindio.proyectobases.servicios.implementaciones;

import co.edu.uniquindio.proyectobases.modelo.PlanEstudio;
import co.edu.uniquindio.proyectobases.repositorios.PlanEstudioRepository;
import co.edu.uniquindio.proyectobases.servicios.interfaces.PlanEstudioServicio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlanEstudioServicioImpl implements PlanEstudioServicio {
    private PlanEstudioRepository planEstudioRepository;
    @Override
    public PlanEstudio crearPlanEstudio(PlanEstudio planEstudio) throws Exception {
        return planEstudioRepository.save(planEstudio);
    }

    @Override
    public PlanEstudio actualizarPlanEstudio(PlanEstudio planEstudio) throws Exception {
        return null;
    }

    @Override
    public void eliminarPlanEstudio(Long id) throws Exception {

    }

    @Override
    public PlanEstudio obtenerPlanEstudio(Long id) throws Exception {
        return planEstudioRepository.findById(id).orElse(null);
    }

    @Override
    public List<PlanEstudio> listarPlanesEstudio() {
        return null;
    }
}
