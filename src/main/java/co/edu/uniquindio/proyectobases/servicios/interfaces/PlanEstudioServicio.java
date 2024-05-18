package co.edu.uniquindio.proyectobases.servicios.interfaces;

import co.edu.uniquindio.proyectobases.modelo.PlanEstudio;

import java.util.List;

public interface PlanEstudioServicio {
    PlanEstudio crearPlanEstudio(PlanEstudio planEstudio) throws Exception;
    PlanEstudio actualizarPlanEstudio(PlanEstudio planEstudio) throws Exception;
    void eliminarPlanEstudio(Long id) throws Exception;
    PlanEstudio obtenerPlanEstudio(Long id) throws Exception;
    List<PlanEstudio> listarPlanesEstudio();
}
