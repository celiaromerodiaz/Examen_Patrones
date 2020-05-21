package com.politecnico;

import com.politecnico.Tipo_Reacciones.EstiloReaccion;
import com.politecnico.Tipo_Reacciones.Reaccion;
import com.politecnico.factory_estilo_reaccion.EstiloReaccionFactory;
import com.politecnico.strategy.Niño;

import java.util.Scanner;

public class App {
    static Scanner lectorTeclado = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        Niño niño = new Niño("Jacinto García");
        niño.setDeseo("un paquete de galletas");

        for (int i=1; i<5; i++){
            System.out.print("En el intento " + i + " " + niño.getNombre() + " ");
            System.out.println(niño.conseguirDeseo(i));
        }

        System.out.println("-------------------------------------");
        System.out.println("¿Cuál es la reacción del niño?:");
        System.out.print( "1. Lloron\n" +
                "2. Escondido\n" +
                "3. Caprichoso\n" +
                "4. Penoso\n" +
                "5. Gritón\n" +
                "Opción elegida: ");
        int opcion = lectorTeclado.nextInt();
        System.out.println("------------------------------------");


        EstiloReaccion estiloReaccion = EstiloReaccionFactory.getEstiloReaccion(opcion);
        Reaccion generadorReaccion = new Reaccion();
        generadorReaccion.setEstiloReaccion(estiloReaccion);
        System.out.println(generadorReaccion.getReaccion());
    }
}
