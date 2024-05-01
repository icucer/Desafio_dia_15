package cl.praxis.desafio_dia_15;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nSeleccione que ejercicio quere realizar.\n");
            System.out.println("1.      Visitas");
            System.out.println("2.    Smart watch");
            System.out.println("3.  Multiplos de tres");
            System.out.println("4.       Salir");
            System.out.print("Ingresar su opcion aca:");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    Visitas.main(args);
                    break;
                case 2:
                    SmartWatch.main(args);
                    break;
                case 3:
                    MultiplosDeTres.main(args);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("\nSelecciona una opcion valida.");
                    break;
            }

        } while (opcion != 4);
    }
}