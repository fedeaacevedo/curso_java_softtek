package domain;

public class TipoDeTrabajoPresencial extends TipoDeTrabajo{
    private String lugar;

    @Override
    public void setLugarDeTrabajo(String lugar) {
    this.lugar = lugar;
    }

    @Override
    public String detalleParaTitulo() {
        return "Presencial - "+ this.lugar;
    }
}
