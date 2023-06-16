/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pantasvszombies;

/**
 *
 * @author Usuario
 */
public class BalaVerde extends ObjetoGrafico{ // Extiende de la clase Objeto Grafico
    String nombre; // Atributo que contendra el nombre del objeto
    
    public BalaVerde(String nom){ //Constructor de la clase
        nombre = nom;        
    }
    
    public void mover(){ // Sobreescritura del metodo mover
        System.out.println("Movimiento de Bala Verde, Yo me llamo: " + nombre);
    }
}
