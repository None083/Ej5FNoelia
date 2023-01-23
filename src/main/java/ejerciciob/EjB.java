/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciob;

import java.util.Scanner;

/**
 *
 * @author Noelia
 */
public class EjB {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        do {            
        System.out.println("Introduce un número de 2-10");
        numero = teclado.nextInt();    
        } while (numero < 2 || numero > 10);
        
        char[][] matriz = new char[numero][(numero * 2) - 1];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = ' ';
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < (matriz[i].length / 2) + 1; j++) {
                
            }
        }
        
        
    }
    
}
