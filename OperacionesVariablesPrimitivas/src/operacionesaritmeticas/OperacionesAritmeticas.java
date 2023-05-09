/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionesaritmeticas;

import java.util.Scanner;

/**
 *
 * @author erickson.vergara
 */
public class OperacionesAritmeticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1;
        int num2;
        int suma, resta, multiplicaion, division, modulo;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresa el primer número: ");
        num1 = teclado.nextInt();
        System.out.println("Ingresa el segundo número");
        num2 = teclado.nextInt();
        
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicaion = num1 * num2;
        division = num1 / num2;
        modulo = num1 % num2;
        
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicaion es: " + multiplicaion);
        System.out.println("El resultado de la division es: " + division);
        System.out.println("El resultado del modulo es: " + modulo);
        
        
    }
    
}
