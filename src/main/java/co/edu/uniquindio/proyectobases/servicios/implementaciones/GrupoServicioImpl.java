package co.edu.uniquindio.proyectobases.servicios.implementaciones;

import co.edu.uniquindio.proyectobases.modelo.Grupo;
import co.edu.uniquindio.proyectobases.repositorios.GrupoRepository;
import co.edu.uniquindio.proyectobases.servicios.interfaces.GrupoServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class GrupoServicioImpl implements GrupoServicio {
    private final GrupoRepository grupoRepository;
    @Override
    public Grupo crearGrupo(Grupo grupo) throws Exception {
        if(grupoRepository.existsById(grupo.getId())){
            throw new Exception("El grupo ya existe");
        }else{
            return grupoRepository.save(grupo);
        }
    }

    @Override
    public Grupo actualizarGrupo(Grupo grupo) throws Exception {
        return null;
    }

    @Override
    public void eliminarGrupo(Long id) throws Exception {

    }

    @Override
    public Grupo obtenerGrupo(Long id) throws Exception {
        return grupoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Object[]> listarGrupos() {
        return grupoRepository.obtenerGrupos();
    }
}
