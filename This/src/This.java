/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erickson.vergara
 */
public class This extends This2{
    
    int variable = 5;
    Clase2 obj2 = new Clase2();
    
    public This(){
        this("Erickson");//Invocando un constructor mediante la palabra This. //Cuando se invoca un cosntructor dentro de optro cosntructor este debe estar de primero.
        System.out.println("Constructor sin paramentros");              
    }
    
    public This(String nombre){
        System.out.println("El nombre es: " + nombre);
    } 

public void metodo(int variable){
    System.out.println("El valor de la variable es: " + this.variable); //Imprimimos el valor de la variable Globlal
    System.out.println("El valor de la variable es: " + variable); //Imprimnimos el valor de la variable Local
}

public void metodo2(){
    obj2.metodo(5); //Invocamos el metodo de la clase 2
    this.metodo(15); //invoco el metodo de mi propia clase
}

public void metodo3(This2 obj){
    
}

public void metodo4(){
    this.metodo3(this);
}

    public static void main(String[] args) {
        This obj = new This(); //Creamos una instancia de la clasr This
        obj.metodo(20);
        obj.metodo2();
        
    }
}
