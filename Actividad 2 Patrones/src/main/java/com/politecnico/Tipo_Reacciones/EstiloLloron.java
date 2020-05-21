package com.politecnico.Tipo_Reacciones;

public class EstiloLloron implements EstiloReaccion {
    @Override
    public String responder() {
        return "intenta coger " + deseo + " sin que le vean";
    }
}