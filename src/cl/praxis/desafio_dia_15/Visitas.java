package cl.praxis.desafio_dia_15;

import java.util.ArrayList;
import java.util.Scanner;

public class Visitas {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listaVisitas = new ArrayList<>();
        String visitasDiarias;

        // Ciclo de repeticion hasta se engresa un enter vacio
        while (true) {
            int visitas;
            System.out.print("\nIngresa el numero de visitas (o presiona enter para salir): ");
            visitasDiarias = sc.nextLine();
            if (visitasDiarias.isEmpty()) {
                break;
            } else {
                // Bloque try-catch para manejo de errores que pueden aparecer en proceso de parseInt
                try {
                    visitas = Integer.parseInt(visitasDiarias);
                    listaVisitas.add(visitas);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Debes ingresar un número válido.");
                }
            }
        }
        System.out.println("\nEl promedio de las vizitas es: "+promedio (listaVisitas));
    }

    // Metodo promedio
    public static int promedio(ArrayList<Integer> listaVisitas) {
        if (listaVisitas.isEmpty()) {
            return 0;
        }
        int suma = 0;
        for (int visita : listaVisitas){
            suma += visita;
        }
        return suma/listaVisitas.size();
    }
}