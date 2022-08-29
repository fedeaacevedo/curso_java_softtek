package domain.requisitos;

import domain.Postulacion;
import domain.Postulante;

public interface Requisito {
    public Boolean teCumplisPara(Postulante postulante);
}
