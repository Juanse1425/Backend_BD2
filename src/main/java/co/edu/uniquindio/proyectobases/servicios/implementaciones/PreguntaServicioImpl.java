package co.edu.uniquindio.proyectobases.servicios.implementaciones;

import co.edu.uniquindio.proyectobases.modelo.Pregunta;
import co.edu.uniquindio.proyectobases.repositorios.PreguntaRepository;
import co.edu.uniquindio.proyectobases.servicios.interfaces.PreguntaServicio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public List<Object> obtenerPreguntasPrivadas(Long idProfesor, Long idTema) {
        List<Object[]> results = preguntaRepository.obtenerPreguntasPrivadas(idProfesor, idTema);
        List<Object> preguntasPrivadas = new ArrayList<>();

        for (Object[] result : results) {
            Long id = (Long) result[0];
            String preguntaTexto = (String) result[1];
            Long tipoId = (Long) result[2];
            String privacidad = (String) result[3];
            String opcionesConcatenadas = (String) result[4];

            String[] opcionesArray = opcionesConcatenadas.split(",");
            List<Object> opciones = new ArrayList<>();

            for (String opcionStr : opcionesArray) {
                String[] opcionParts = opcionStr.split(":");
                Long opcionId = Long.parseLong(opcionParts[0]);
                String texto = opcionParts[1];
                String respuesta = opcionParts[2];

                Map<String, Object> opcionMap = new HashMap<>();
                if(tipoId != 4){
                    if(respuesta.equals("true")) {
                        opcionMap.put("correct", true);
                    }else{
                        opcionMap.put("correct", false);
                    }
                }else{
                    opcionMap.put("correct", respuesta);
                }
                opcionMap.put("text", texto);
                opcionMap.put("id", opcionId);

                opciones.add(opcionMap);
            }

            Map<String, Object> preguntaMap = new HashMap<>();
            if(privacidad.equals("false")){
                preguntaMap.put("privacidad", false);
            }else{
                preguntaMap.put("privacidad", true);
            }
            preguntaMap.put("opciones", opciones);
            preguntaMap.put("tipo_pregunta", tipoId);
            preguntaMap.put("pregunta", preguntaTexto);
            preguntaMap.put("id", id);
            preguntaMap.put("isBanco", true);

            preguntasPrivadas.add(preguntaMap);
        }

        return preguntasPrivadas;
    }

    public List<Object> obtenerPreguntasPublicas(Long idTema) {
        List<Object[]> results = preguntaRepository.obtenerPreguntasPublicas(idTema);
        List<Object> preguntasPrivadas = new ArrayList<>();

        for (Object[] result : results) {
            Long id = (Long) result[0];
            String preguntaTexto = (String) result[1];
            Long tipoId = (Long) result[2];
            String privacidad = (String) result[3];
            String opcionesConcatenadas = (String) result[4];

            String[] opcionesArray = opcionesConcatenadas.split(",");
            List<Object> opciones = new ArrayList<>();

            for (String opcionStr : opcionesArray) {
                String[] opcionParts = opcionStr.split(":");
                Long opcionId = Long.parseLong(opcionParts[0]);
                String texto = opcionParts[1];
                String respuesta = opcionParts[2];

                Map<String, Object> opcionMap = new HashMap<>();
                if(tipoId != 4){
                    if(respuesta.equals("true")) {
                        opcionMap.put("correct", true);
                    }else{
                        opcionMap.put("correct", false);
                    }
                }else{
                    opcionMap.put("correct", respuesta);
                }
                opcionMap.put("text", texto);
                opcionMap.put("id", opcionId);

                opciones.add(opcionMap);
            }

            Map<String, Object> preguntaMap = new HashMap<>();
            if(privacidad.equals("false")){
                preguntaMap.put("privacidad", false);
            }else{
                preguntaMap.put("privacidad", true);
            }
            preguntaMap.put("opciones", opciones);
            preguntaMap.put("tipo_pregunta", tipoId);
            preguntaMap.put("pregunta", preguntaTexto);
            preguntaMap.put("id", id);
            preguntaMap.put("isBanco", true);

            preguntasPrivadas.add(preguntaMap);
        }

        return preguntasPrivadas;
    }
}
