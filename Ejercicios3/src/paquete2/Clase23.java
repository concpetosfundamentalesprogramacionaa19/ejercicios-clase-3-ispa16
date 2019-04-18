/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Clase23 {
    
    public static void main(String[] args) {
        // uso de cast
        
        int valor1 = 10;
        String edad = "20";
        String cadena = "10.293";
        double variable3 = (double) (valor1);
        double variable4 = Double.parseDouble(cadena) ;
        int miedad = (int) Double.parseDouble(edad);
        int miedad2 = Integer.parseInt(edad);
        
        System.out.printf("%.2f\n", variable4);
        
        //System.out.printf("%.2f\n", Double.parseDouble(cadena));
    }
    
}
