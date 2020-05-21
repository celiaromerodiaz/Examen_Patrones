package com.politecnico.strategy;

import com.politecnico.Tipo_Reacciones.EstiloReaccion;
import com.politecnico.factory_estilo_reaccion.EstiloReaccionFactory;

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
        EstiloReaccion estiloReaccion = EstiloReaccionFactory.getEstiloReaccion(intento);
        return estiloReaccion.responder(deseo);
    }

    public String getNombre() {
        return nombre;
    }
}
