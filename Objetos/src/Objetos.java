/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erickson.vergara
 */
public class Objetos {
    String nombre;
    String color;

    public static void main(String[] args) {
        Objetos objetos1 = new Objetos(); //Creando dos Objetos de la clase Objetos.
        Objetos objetos2 = new Objetos();
        
        objetos1.nombre = "objeto1";
        objetos2.nombre = "objeto2";
        
        objetos1.color = "azul";
        objetos2.color = "verde";
        
        System.out.println("El nombre del objeto 1 es : " + objetos1.nombre);
        System.out.println("El color del objeto 1 es: " + objetos1.color);        
        System.out.println("---------------------------------------------------");        
        System.out.println("\nEl nombre del objeto 2 es: " + objetos2.nombre);
        System.out.println("El color delobjeto 2 es: "+ objetos2.color);
    }
    
}
