package com.politecnico.Tipo_Reacciones;

public class Reaccion {
    private EstiloReaccion estiloReaccion;

    public void setEstiloReaccion(EstiloReaccion estiloReaccion){
        this.estiloReaccion = estiloReaccion;
    }

    public String getReaccion(){
        return estiloReaccion.responder();
    }
}
