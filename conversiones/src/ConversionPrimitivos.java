/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erickson.vergara
 */
public class ConversionPrimitivos {
    public static void main(String[] args) {
        int a= 1;        
        double b = 2.5;
       int codigo = 97;
       char codigoASCII = (char)codigo;
        
        b = a;
        a = (int)b;
        
        System.out.println("El valor de a es: " + a);
        System.out.println("El valor de b es: " + b);
        System.out.println("El valor de char es: " + codigoASCII);
    }
    
}
