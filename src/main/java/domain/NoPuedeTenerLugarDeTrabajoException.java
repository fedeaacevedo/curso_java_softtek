package domain;

public class NoPuedeTenerLugarDeTrabajoException extends RuntimeException{

    public NoPuedeTenerLugarDeTrabajoException(){
        super("No se le puede asignar un lugar de trabajo porque el tipo de trabajo es remoto");
    }

}
