/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pantasvszombies;

/**
 *
 * @author Usuario
 */
public class BalaPlata extends ObjetoGrafico{ //Hereda de la clase Objeto Grafico
    
    String nombre; //Atributo que contendra el nombre del objeto
    
    public BalaPlata(String nom){ //Constructor
        nombre = nom;
    }
    
    @Override
    public void mover(){ //Sobreescritura del metodo mover
        System.out.println("Moimiento de Bala Plata. Yo me llamo: " + nombre);
    }
}
