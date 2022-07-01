package caio.luiz.observador;

import caio.luiz.programa.TipoPrograma;

import java.time.LocalDateTime;

public class EstadoDeFim {
    public LocalDateTime horaDoFim;
    public TipoPrograma tipoPrograma;
    public EstadoDeFim(LocalDateTime horaDoFim, TipoPrograma tipoPrograma) {
        this.horaDoFim = horaDoFim;
        this.tipoPrograma = tipoPrograma;
    }
}
