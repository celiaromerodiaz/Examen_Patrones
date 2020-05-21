package com.politecnico.strategy;

public class Niño {
    private String nombre;
    private String deseo;

    public Niño( String nombre){
        this.nombre = nombre;
    }

    public void setDeseo(String deseo){
        this.deseo = deseo;
    }

    public String conseguirDeseo(int intento){
        if (intento == 1)
            return "intenta coger " + deseo + " sin que le vean"; //estilo escondido
        else if (intento == 2)
            return "dice a un adulto: ¡Quiero " + deseo + "!"; //estilo caprichoso
        else if (intento == 3)
            return "pone cara de pena y decir a un adulto " + deseo; //estilo penoso
        else if (intento == 4)
            return "llora y grita a un adulto ¡" + deseo + "!"; //estilo griton
        else
            return "se va a un rincón a llorar"; //estilo lloron
    }

    public String getNombre() {
        return nombre;
    }
}
