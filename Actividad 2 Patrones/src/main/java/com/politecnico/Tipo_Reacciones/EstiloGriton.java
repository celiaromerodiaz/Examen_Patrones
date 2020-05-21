package com.politecnico.Tipo_Reacciones;

public class EstiloGriton implements EstiloReaccion {
    @Override
    public String responder() {
        return "llora y grita a un adulto ¡" + deseo + "!";
    }
}
