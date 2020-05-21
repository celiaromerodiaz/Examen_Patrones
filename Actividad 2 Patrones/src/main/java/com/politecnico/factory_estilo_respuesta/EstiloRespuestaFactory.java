package com.politecnico.factory_estilo_respuesta;

public class EstiloRespuestaFactory {
    public static EstiloRespuesta getEstiloRespuesta(int estilo){
        switch (estilo){
            case EstiloRespuesta.ESTILO_ESCONDIDO:
                return new EstiloEscondido();
            case EstiloRespuesta.ESTILO_CAPRICHOSO:
                return new EstiloCaprichoso();
            case EstiloRespuesta.ESTILO_PENOSO:
                return new EstiloPenoso();
            case EstiloRespuesta.ESTILO_GRITON:
                return new EstiloGriton();
            default:
                return new EstiloLloron();

        }
    }
}
