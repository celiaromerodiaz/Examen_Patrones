package com.politecnico.Tipo_Reacciones;

public class EstiloEscondido implements EstiloReaccion {
    @Override
    public String responder() {
        return "intenta coger " + deseo + " sin que le vean";
    }
}
