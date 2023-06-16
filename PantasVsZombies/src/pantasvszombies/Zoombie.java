/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pantasvszombies;

/**
 *
 * @author Usuario
 */
public class Zoombie extends ObjetoGrafico{ // Extiende de la clase Objeto Grafico
    String nombre ; // Atributo que contendra el nombre del objeto
    
    public Zoombie(String nom){ // Constructor de la clase
        nombre = nom;
    }
    
    @Override
    public void mover(){ // Sobreescritura del metodo mover de la clase Objeto Grafico
        System.out.println("Movimiento de Zoombie. Yo me llamo: " + nombre);
    }
    
}
