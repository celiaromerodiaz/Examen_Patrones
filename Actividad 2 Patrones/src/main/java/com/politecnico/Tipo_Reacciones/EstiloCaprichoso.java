package com.politecnico.Tipo_Reacciones;

public class EstiloCaprichoso implements EstiloReaccion {
    @Override
    public String responder() {
        return "dice a un adulto: ¡Quiero " + deseo + "!";
    }
}
