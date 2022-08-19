package domain;

public class TipoDeTrabajoRemoto extends TipoDeTrabajo{
    @Override
    public void setLugarDeTrabajo(String lugar) {

        throw new NoPuedeTenerLugarDeTrabajoException();
    }

    @Override
    public String detalleParaTitulo() {
        return "Remoto";
    }
}
