package com.politecnico.factory_estilo_reaccion;

import com.politecnico.Tipo_Reacciones.*;

public class EstiloReaccionFactory {
    public static EstiloReaccion getEstiloReaccion(int estilo){
        switch (estilo){
            case EstiloReaccion.ESTILO_ESCONDIDO:
                return new EstiloEscondido();
            case EstiloReaccion.ESTILO_CAPRICHOSO:
                return new EstiloCaprichoso();
            case EstiloReaccion.ESTILO_PENOSO:
                return new EstiloPenoso();
            case EstiloReaccion.ESTILO_GRITON:
                return new EstiloGriton();
            default:
                return new EstiloLloron();

        }
    }
}
