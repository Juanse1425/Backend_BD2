package co.edu.uniquindio.proyectobases.servicios.implementaciones;

import co.edu.uniquindio.proyectobases.modelo.Estudiante;
import co.edu.uniquindio.proyectobases.repositorios.EstudianteRepository;
import co.edu.uniquindio.proyectobases.servicios.interfaces.EstudianteServicio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class EstudianteServicioImpl implements EstudianteServicio {
    private final EstudianteRepository estudianteRepository;
    @Override
    public Estudiante registrarEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public Estudiante actualizarEstudiante(Estudiante estudiante) {
        return null;
    }

    @Override
    public void eliminarEstudiante(Estudiante estudiante) {

    }

    @Override
    public Estudiante obtenerEstudiante(Long id) {
        return null;
    }

    @Override
    public List<Estudiante> listarEstudiantes() {
        return null;
    }

    public List<Object> obtenerExamenesEstudiante(Long idEstudiante) {
        List<Object[]> results = estudianteRepository.obtenerExamenesEstudiante(idEstudiante);
        List<Object> examenes = new ArrayList<>();

        for(Object[] result : results){
            Long id = (Long) result[0];
            String name = (String) result[1];
            Map<String, Object> examenesMap = new HashMap<>();
            examenesMap.put("id", id);
            examenesMap.put("name", name);
            examenes.add(examenesMap);
        }


        return examenes;
    }
}
