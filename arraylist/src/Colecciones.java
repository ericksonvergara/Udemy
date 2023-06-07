
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erickson.vergara
 */
public class Colecciones {
    public static void main(String[] args) {
        ArrayList <String> array = new ArrayList<String>(); 
        
        array.add("Rojo");
        array.add("Azul");
        array.add("Verde");
        
        //Recorriendo el Array
        for (String elemento : array) {
            System.out.println("Valor: " + elemento );
        }
        
        //Preguntando si existe dicho elemento en el array
        if (array.contains("Verde")) {
            System.out.println("Si tengo el elemento verde");
        }
        
        if (array.contains("Amarillo")) {
            System.out.println("Si tengo el elemento Amarillo");
        }else{
            System.out.println("No tengo el elemento Amarillo");
        }
        
        //Preguntando si el Array esta vacio (IsEmpty())
        System.out.println("El array esta vacio? :  "+ array.isEmpty());
        
        //Limpiando el Array
        array.clear();
        
        System.out.println("El array esta vacio ahora?: " + array.isEmpty());
    }
}
