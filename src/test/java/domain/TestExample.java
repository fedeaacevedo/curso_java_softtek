package domain;

public class TestExample {

    public static void main(String[] args) {
        OfertaLaboral unaOfertaLaboral = new OfertaLaboral();

        unaOfertaLaboral.setTitulo("Busqueda de Desarrollador Java Junior");
        unaOfertaLaboral.setDetalleNarrado("Debera contar con conocimientos basicos de Java y manejo de dependecias en Maven");

        Tarea unaTarea = new Tarea();
        unaTarea.setDescripcion("Desarrollador codigo de logica de negocio");

        Tarea otraTarea = new Tarea();
        otraTarea.setDescripcion("Subir codigo desarrollado a repositorio remoto");

        Tarea otraTareaMas = new Tarea();
        otraTareaMas.setDescripcion("Realizar tests unitarios");

        unaOfertaLaboral.agregarTarea(otraTarea);
        unaOfertaLaboral.agregarTarea(otraTareaMas);

        unaOfertaLaboral.setModalidadDeContrato(ModalidadDeContrato.FULL_TIME);

        TipoDeTrabajo trabajoPresencial = new TipoDeTrabajoPresencial();
        trabajoPresencial.setLugarDeTrabajo("Puerto Madero");

        unaOfertaLaboral.setTipoDeTrabajo(trabajoPresencial);

        Categoria sistemas = new Categoria();
        sistemas.setNombre("Sistemas");

        unaOfertaLaboral.setCategoria(sistemas);

        unaOfertaLaboral.setMontoOfrecido(5000.0);
        unaOfertaLaboral.setFrecuenciaPago(FrecuenciaPago.SEMANAL);


    }

}
