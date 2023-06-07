/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erickson.vergara
 */
public class Foreach {
    public static void main(String[] args) {
        int [] arreglo = {87,64,94,100,83,78,100,91,76,87};
        int total1 = 0;
        int total = 0;
        
        //Forma tradicional
        for (int i = 0; i < arreglo.length; i++) {
            total1 += arreglo[i];
        }
        
        //Forach
        for (int numero : arreglo) {
            total += numero;
        }
        
        System.out.println("EL valor de la suma esuando el for tradicional es: " + total1);
        
        System.out.println("Ela valor de la suma usando foreach es: " + total);
    }
    
}
