package domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class Postulacion {
    private Postulante postulante;
    private OfertaLaboral ofertaLaboral;
    private LocalDate fecha;
    private String cv;
    private Double renumeracionPretendida;
    private FrecuenciaPago frecuenciaPretendida;
}
