/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erickson.vergara
 */
public class Wrapper {
    public static void main(String[] args) {
        int numero = 9;
        Integer objInt = new Integer(numero);
        
        double numeroAdouble = objInt.doubleValue();
        short numeroAshort = objInt.shortValue();
        
        int comparacion = Integer.compare(11, 11);
        System.out.println("El valor de la comparacion es: " + comparacion);
        
        int comparacionD = Double.compare(14.5, 15);
        System.out.println("El resultado de la comparación de Double es: " + comparacionD);
        
        
    }
}
