package com.politecnico.Tipo_Reacciones;

public interface EstiloReaccion {

    public final static int ESTILO_GRITON = 1;
    public final static int ESTILO_ESCONDIDO = 2;
    public final static int ESTILO_CAPRICHOSO = 3;
    public final static int ESTILO_PENOSO = 4;
    public final static int ESTILO_LLORON = 5;

    public String responder(String deseo);
}
