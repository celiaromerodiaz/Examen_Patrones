package com.politecnico.Tipo_Reacciones;

public class EstiloCaprichoso implements EstiloReaccion {
    @Override
    public String responder(String deseo) {
        return "dice a un adulto: ¡Quiero " + deseo + "!";
    }
}
