package com.politecnico.Tipo_Reacciones;

public class EstiloLloron implements EstiloReaccion {
    @Override
    public String responder(String deseo) {
        return "se va a un rincón a llorar";
    }
}