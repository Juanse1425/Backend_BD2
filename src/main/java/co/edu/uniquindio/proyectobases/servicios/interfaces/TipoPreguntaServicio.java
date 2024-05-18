package co.edu.uniquindio.proyectobases.servicios.interfaces;

import co.edu.uniquindio.proyectobases.modelo.TipoPregunta;

import java.util.List;

public interface TipoPreguntaServicio {
    public TipoPregunta registrarTipoPregunta(TipoPregunta tipoPregunta);
    public void eliminarTipoPregunta(String tipo);
    public TipoPregunta actualizarTipoPregunta(TipoPregunta tipoPregunta);
    public TipoPregunta obtenerTipoPregunta(Long tipo);
    List<TipoPregunta> listarTiposPreguntas();
}
