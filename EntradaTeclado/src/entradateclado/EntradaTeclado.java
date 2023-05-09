/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entradateclado;

import java.util.Scanner;

/**
 *
 * @author erickson.vergara
 */
public class EntradaTeclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Comiezo del programa...");
        System.out.println("Escribe tu Nombre");
        String nombre =  "";
        
        Scanner entradaTeclado = new Scanner(System.in);
        
        nombre = entradaTeclado.nextLine();
        
        System.out.println("Tu nombre es: " + nombre);
    }
    
}
