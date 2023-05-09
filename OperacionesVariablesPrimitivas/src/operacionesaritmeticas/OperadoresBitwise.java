/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacionesaritmeticas;

/**
 *
 * @author erickson.vergara
 */
public class OperadoresBitwise {
    public static void main(String[] args) {
        int comparacion = 5 | 3;
        
        System.out.println("El resultado de esta comparación es: " + comparacion);
        
        int comparacionAnd = 5 & 3;
        
        System.out.println("El resultado de esta comparación es: " + comparacionAnd);
        
        boolean b1 = true;
        boolean b2 = false;
        
        boolean resultado = b1 & b2;
        System.out.println("El resultado es: " + resultado);
        
        boolean resultado2 = b1 | b2;
        System.out.println("El resultado es: " + resultado2);
    }
}
