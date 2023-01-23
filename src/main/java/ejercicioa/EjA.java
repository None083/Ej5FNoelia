/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicioa;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Noelia
 */
public class EjA {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int[][] matriz;

        System.out.println("""
                           
                                   E S C O J E   U N A   O P C I Ó N
                           -----------------------------------------------------
                                        A - MANUAL
                                        B - AUTOMÁTICO
                           -----------------------------------------------------
                           
                           """);

        String opcion = teclado.nextLine();
        int n = 0;
        if (opcion.equalsIgnoreCase("A") || opcion.equalsIgnoreCase("B")) {
            do {
                System.out.println("Introduzca un número entre 3-6");
                n = teclado.nextInt();
            } while (n < 3 || n > 6);
        }
        matriz = new int[n][n];
        opcion = opcion.toUpperCase();
        switch (opcion) {
            case "A":
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        matriz[i][j] = teclado.nextInt();
                    }
                }
                break;
            case "B":
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        matriz[i][j] = aleatorio.nextInt(21);
                    }
                }
                break;
            default:
                System.out.println("Opción no válida");
        }

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " - ");
            }
            System.out.println("");
        }
        System.out.println(buscarCoordenada(matriz));

    }

    private static Coordenada buscarCoordenada(int[][] matriz) {
        int numeroMayor = -1;
        int numeroMenor=-1;
        int coordenadaX = -1;
        int coordenadaY = -1;
        for (int i = 0; i < matriz.length; i++) {
            numeroMayor = -1;
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > numeroMayor) {
                    numeroMayor = matriz[i][j];
                    coordenadaX=j;
                    coordenadaY=i;
                }
            }
            numeroMenor=numeroMayor;
            for(int k=0;k<matriz.length;k++){
                if(numeroMenor>=matriz[k][coordenadaX]){
                    numeroMenor=matriz[k][coordenadaX];
                }
            }
            if(numeroMayor==numeroMenor){
                return new Coordenada(coordenadaY,coordenadaX);
            }
        }
        return new Coordenada();
    }

}
