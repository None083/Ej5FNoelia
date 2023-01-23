/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioa;

/**
 *
 * @author Noelia
 */
public class Coordenada {
    
    private int x;
    private int y;

    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordenada() {
        this.x = -1;
        this.y = -1;
    }

    @Override
    public String toString() {
        return "Coordenada{" + "y=" + x + ", x=" + y + '}';
    }
    
}
