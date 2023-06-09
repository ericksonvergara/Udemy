/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erickson.vergara
 */
public class Gato extends Mamifero { // esta clase Gato hereda de la clase Mamifero

    public static void main(String[] args) {
        Gato g = new Gato();// Creamos una clase gato
        System.out.println("El gato es: " + g);// Imprimimos el Objeto
        Mamifero m = g;//realñizamos un upcasting 
        System.out.println("El Mamifero es: " + m);//imprimimos el objeto mamifero

//        Mamifero m = new Gato();
//        System.out.println("El mamifero es: " + m);
        Gato g1 = new Gato();
        Animal a = g1;

        if (a instanceof Gato) {
            System.out.println("Puedes hacer la conversion con toda confianza");
            Gato g12= (Gato)a;
        }

    }
}
