/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medida;

/**
 *
 * @author Oscar
 */
public class Circulo {
    private int radio;
    private static int total = 5;

    public Circulo(int radio) {
        this.radio = radio;
        total = total + 1;
    }
    public static int dameTotal() {
        return total;
    }
    
}
