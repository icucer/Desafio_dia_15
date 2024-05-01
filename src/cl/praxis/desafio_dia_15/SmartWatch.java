package cl.praxis.desafio_dia_15;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartWatch {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listaPasos = new ArrayList<>();
        String pasosDiarios;

        // Ciclo de repeticion hasta se engresa un enter vacio
        while (true) {
            int pasos;
            System.out.print("\nIngresa el numero de pasos (o presiona enter para salir): ");
            pasosDiarios = sc.nextLine();
            if (pasosDiarios.isEmpty()) {
                break;
            } else {
                // Bloque try-catch para manejo de errores que pueden aparecer en proceso de parseInt
                try {
                    pasos = Integer.parseInt(pasosDiarios);
                    listaPasos.add(pasos);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Debes ingresar un número válido.");
                }
            }
        }
        System.out.println("\nEl promedio de los pasos es: "+clearSteps (listaPasos));
    }

    public static int clearSteps(ArrayList<Integer> listaPasos) {
        if (listaPasos.isEmpty()) {
            return 0;
        }
        int contadorElementos = 0;
        int suma = 0;
        for (int pasos : listaPasos) {
            if (pasos > 200 && pasos < 100000) {
                suma += pasos;
                contadorElementos++;
            }
        }
        return suma/contadorElementos;
    }
}
