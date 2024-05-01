package cl.praxis.desafio_dia_15;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiplosDeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        String elementoNumero;

        // Ciclo de repeticion hasta se engresa un enter vacio
        while (true) {
            int numero;
            System.out.print("\nIngresa el numero (o presiona enter para salir): ");
            elementoNumero = sc.nextLine();
            if (elementoNumero.isEmpty()) {
                break;
            } else {
                // Bloque try-catch para manejo de errores que pueden aparecer en proceso de parseInt
                try {
                    numero = Integer.parseInt(elementoNumero);
                    listaNumeros.add(numero);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Debes ingresar un número válido.");
                }
            }
        }
        int opcion;
        do {
            System.out.println("\nSeleccione que operacion necesita realizar:\n");
            System.out.println("1.      Suma");
            System.out.println("2.    Promedio");
            System.out.println("3. Suma & Promedio");
            System.out.println("4.      Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nLa suma de los numeros multiplos de tres es: " +"\n"+ suma(listaNumeros));
                    break;
                case 2:
                    System.out.println("\nEl promedio de los numeros multiplos de tres es: " +"\n"+ promedio(listaNumeros));
                    break;
                case 3:
                    System.out.println("\nLa suma y el promedio de los numeros multiplos de tres es: " +"\n"+ suma(listaNumeros)+"\n"+promedio(listaNumeros));
                    break;
                case 4:
                    break;
                default:
                    System.out.println("\nSelecciona una opcion valida.");
                    break;
            }

        } while (opcion != 4);
    }

    public static int suma (ArrayList<Integer> listaNumeros) {
        if (listaNumeros.isEmpty()) {
            return 0;
        }
        int suma = 0;
        for (int numero : listaNumeros) {
            if (numero% 3 == 0) {
                suma += numero;
            }
        }
        return suma;
    }

    public static int promedio (ArrayList<Integer> listaNumeros) {
        if (listaNumeros.isEmpty()) {
            return 0;
        }
        int contadorElementos = 0;
        int suma = 0;
        for (int numero : listaNumeros) {
            if (numero% 3 == 0) {
                suma += numero;
                contadorElementos++;
            }
        }
        return suma / contadorElementos;
    }
}
