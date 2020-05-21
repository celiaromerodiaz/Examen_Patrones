package com.politecnico.Tipo_Reacciones;

public class EstiloPenoso implements EstiloReaccion {
    @Override
    public String responder(String deseo) {
        return "pone cara de pena y decir a un adulto " + deseo;
    }
}
