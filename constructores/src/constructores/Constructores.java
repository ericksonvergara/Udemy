/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructores;

/**
 *
 * @author erickson.vergara
 */
public class Constructores {
    
    String nombre;
    String apellido;
    
    public Constructores(){
        System.out.println("Hola soy el constructor");  //Creando el primer constructor
        System.out.println("hola");        
    }
    
    public Constructores(String nom, String ape){
        nombre = nom;
        apellido = ape;
    }
    
    public Constructores(int a, int b){
        int suma = a + b;
        System.out.println("El resultado de la suma es: " + suma);
    }
    
    public Constructores(final Constructores objConstructor){ //Creando un constructor copia
        nombre = objConstructor.nombre;
        apellido = objConstructor.apellido;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Constructores obj = new Constructores();
        Constructores obj2 = new Constructores(5,6);
        Constructores obj3 = new Constructores("Erickson","Vergara");
        Constructores obj4 = new Constructores(obj3); // COnstructor copia-> este constructor copio del constructor copia.
        System.out.println("nombre obj4: " + obj4.nombre);
        System.out.println("apellido obj4: " + obj4.apellido );
    }
    
}
