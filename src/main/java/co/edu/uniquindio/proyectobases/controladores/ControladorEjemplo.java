package co.edu.uniquindio.proyectobases.controladores;

import co.edu.uniquindio.proyectobases.modelo.*;
import co.edu.uniquindio.proyectobases.modelo.dto.*;
import co.edu.uniquindio.proyectobases.servicios.implementaciones.*;
import co.edu.uniquindio.proyectobases.servicios.interfaces.CursoServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/ejemplos"})
@RequiredArgsConstructor
public class ControladorEjemplo {
    private final UsuarioServicioImpl usuarioServicioImpl;
    private final EstudianteServicioImpl estudianteServicioImpl;
    private final GrupoServicioImpl grupoServicioImpl;
    private final ProfesorServicioImpl profesorServicioImpl;
    private final CursoServicio cursoServicioImpl;
    private final PlanEstudioServicioImpl planEstudioServicioImpl;
    private final UnidadServicioImpl unidadServicioImpl;
    private final TemaServicioImpl temaServicioImpl;
    private final ExamenServicioImpl examenServicioImpl;
    private final TipoPreguntaServicioImpl tipoPreguntaServicioImpl;
    private final PreguntaServicioImpl preguntaServicioImpl;

    @PostMapping({"/usuarios"})
    public ResponseEntity<?> crearUsuario(@RequestBody UsuarioDto usuarioDto) {
        Usuario usuario = new Usuario();
        usuario.setId(usuarioDto.id());
        usuario.setNombre(usuarioDto.nombre());
        usuario.setApellido(usuarioDto.apellido());
        usuario.setCorreo(usuarioDto.correo());
        usuario.setContrasena(usuarioDto.contrasena());
        usuario.setRol(usuarioDto.rol());
        try{
            Usuario usuarioCreado = usuarioServicioImpl.crearUsuario(usuario);
            if(usuarioCreado.getRol().equals("Estudiante")){
                Estudiante estudiante = new Estudiante();
                estudiante.setUsuarios(usuarioCreado);
                estudiante.setGruposIdGrupo(grupoServicioImpl.obtenerGrupo(usuarioDto.grupoId()));
                try{
                    estudianteServicioImpl.registrarEstudiante(estudiante);
                    return ResponseEntity.ok().body(usuarioCreado);
                }catch (Exception e){
                    return ResponseEntity.badRequest().body(e.getMessage());
                }
            }else{
                Profesor profesor = new Profesor();
                profesor.setUsuarios(usuarioCreado);
                try{
                    profesorServicioImpl.crearProfesor(profesor);
                    return ResponseEntity.ok().body(usuarioCreado);
                }catch (Exception e){
                    return ResponseEntity.badRequest().body(e.getMessage());
                }
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping({"/grupos"})
    public ResponseEntity<?> crearGrupo(@RequestBody GrupoDto grupoDto) {
        Grupo grupo = new Grupo();
        grupo.setId(grupoDto.id());
        grupo.setNombre(grupoDto.nombre());
        grupo.setDescripcion(grupoDto.descripcion());
        try{
            grupo.setProfesoresIdUsuario(profesorServicioImpl.obtenerProfesor(grupoDto.idProfesor()));
            Grupo grupoCreado = grupoServicioImpl.crearGrupo(grupo);
            return ResponseEntity.ok().body(grupoCreado);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping({"/cursos"})
    public ResponseEntity<?> crearCurso(@RequestBody CursoDto cursoDto) {
        Curso curso = new Curso();
        curso.setNombre(cursoDto.nombre());
        try{
            Curso cursoCreado = cursoServicioImpl.crearCurso(curso);
            return ResponseEntity.ok().body(cursoCreado);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }

    @PostMapping({"/planestudio"})
    public ResponseEntity<?> crearPlanEstudio(@RequestBody PlanEstudioDto planEstudioDto) {
        PlanEstudio planEstudio = new PlanEstudio();
        planEstudio.setNombre(planEstudioDto.nombre());
        planEstudio.setDescripcion(planEstudioDto.descripcion());
        try{
            planEstudio.setCursosCodigo(cursoServicioImpl.obtenerCurso(planEstudioDto.idCurso()));
            PlanEstudio planEstudioCreado = planEstudioServicioImpl.crearPlanEstudio(planEstudio);
            return ResponseEntity.ok().body(planEstudioCreado);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping({"/unidad"})
    public ResponseEntity<?> crearUnidad(@RequestBody UnidadDto unidadDto) {
        Unidad unidad = new Unidad();
        unidad.setNombre(unidadDto.nombre());
        unidad.setDescripcion(unidadDto.descripcion());
        try{
            unidad.setPlanEstudiosIdPlan(planEstudioServicioImpl.obtenerPlanEstudio(unidadDto.idPlanEstudio()));
            Unidad unidadCreada = unidadServicioImpl.crearUnidad(unidad);
            return ResponseEntity.ok().body(unidadCreada);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping({"/tema"})
    public ResponseEntity<?> crearTema(@RequestBody TemaDto temaDto) {
        Tema tema = new Tema();
        tema.setNombre(temaDto.nombre());
        tema.setDescripcion(temaDto.descripcion());
        try{
            tema.setUnidadesIdUnidad(unidadServicioImpl.obtenerUnidad(temaDto.idUnidad()));
            Tema temaCreado = temaServicioImpl.crearTema(tema);
            return ResponseEntity.ok().body(temaCreado);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping({"/examen"})
    public ResponseEntity<?> crearExamen(@RequestBody ExamenDto examenDto) {
        Examen examen = new Examen();
        examen.setNombre(examenDto.nombre());
        examen.setDescripcion(examenDto.descripcion());
        examen.setDuracion(examenDto.duracion());
        examen.setCantidadTotalPreguntas(examenDto.cantidadTotalPreguntas());
        examen.setCantidadPreguntas(examenDto.cantidadPreguntas());
        try{
            examen.setTemasIdContenido(temaServicioImpl.obtenerTema(examenDto.idTema()));
            examen.setGruposIdGrupo(grupoServicioImpl.obtenerGrupo(examenDto.idGrupo()));
            Examen examenCreado = examenServicioImpl.crearExamen(examen);
            return ResponseEntity.ok().body(examenCreado);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping({"/tipoPregunta"})
    public ResponseEntity<?> crearTipoPregunta(@RequestBody TipoPreguntaDto tipoPreguntaDto) {
        TipoPregunta tipoPregunta = new TipoPregunta();
        tipoPregunta.setNombre(tipoPreguntaDto.nombre());
        tipoPregunta.setDescripcion(tipoPreguntaDto.descripcion());
        try{
            TipoPregunta tipoPreguntaCreado = tipoPreguntaServicioImpl.registrarTipoPregunta(tipoPregunta);
            return ResponseEntity.ok().body(tipoPreguntaCreado);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping({"/pregunta"})
    public ResponseEntity<?> crearPregunta(@RequestBody PreguntaDto preguntaDto) {
        Pregunta pregunta = new Pregunta();
        pregunta.setPreguntaTexto(preguntaDto.preguntaTexto());
        pregunta.setPrivacidad(preguntaDto.privacidad());
        try{
            pregunta.setProfesoresIdUsuario(profesorServicioImpl.obtenerProfesor(preguntaDto.idProfesor()));
            if(preguntaDto.idPreguntaPadre() != null){
                pregunta.setPreguntasIdPregunta(preguntaServicioImpl.obtenerPregunta(preguntaDto.idPreguntaPadre()));

            }
            pregunta.setTemasIdContenido(temaServicioImpl.obtenerTema(preguntaDto.idTema()));
            pregunta.setTiposPreguntasIdTipo(tipoPreguntaServicioImpl.obtenerTipoPregunta(preguntaDto.idTipoPregunta()));
            Pregunta preguntaCreada = preguntaServicioImpl.registrarPregunta(pregunta);
            return ResponseEntity.ok().body(preguntaCreada);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}