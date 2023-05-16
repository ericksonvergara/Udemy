/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erickson.vergara
 */
public class OperacionesStrings {
    public static void main(String[] args) {
        String cadena1 = "Hola";
        String cadena2 = "Dev!";
        int enteroAUnir = 20;
        
        //Concatenar
        String mensaje = cadena1 + " " + cadena2;
        System.out.println(mensaje);
        
        String textoConNumero = cadena1 + enteroAUnir;
        System.out.println(textoConNumero);
        System.out.println(cadena1 + (enteroAUnir + 40));
        
        //Concatenación con CONCAT
        String pruebaConcat = "to".concat("get");
        System.out.println(pruebaConcat);
        
    }
}
