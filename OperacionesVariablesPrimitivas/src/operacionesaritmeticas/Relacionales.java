/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacionesaritmeticas;

import javax.swing.JOptionPane;

/**
 *
 * @author erickson.vergara
 */
public class Relacionales {
    public static void main(String[] args) {
        int i = -3;
        byte b =5;
        short s = 16;
        double d = 3.14;
        
        boolean b1 = i > i;
        boolean b2 = i < b;
        boolean b3 = b <= s;
        boolean b4 = s >= d;
        boolean b5 = d != 0;
        boolean b6 = 1 == s;                
        
        System.out.println("El resultado de comparar i > i es: " + b1);
        System.out.println("El resultado de comparar i < b es: " + b2);
        System.out.println("El resultado de comparar b <= s es: " + b3 );
        System.out.println("El resultado de comparar s >= d es: " + b4);
        System.out.println("El resultado de comparar d != 0 es: " + b5);
        System.out.println("El resultado de comparar 1 == s es: " + b6);
    }    
}
