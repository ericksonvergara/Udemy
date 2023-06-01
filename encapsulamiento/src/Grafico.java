
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erickson.vergara
 */
public class Grafico {
    
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Escribe tu nombre:");
        String nacionalidad = JOptionPane.showInputDialog("Escribe tu nacionalidad:");
        String altura = JOptionPane.showInputDialog("Escribe tu altura:");
        String edad = JOptionPane.showInputDialog("Escribe tu edad:");
        
        double alt = Double.parseDouble(altura);  //convertimso el string recibido en variable de tipo double
        int edadPersona = Integer.parseInt(edad); //convertimso el string recibido en variable de tipo entero
        
        Persona perona = new Persona(); //Creamos un objeto de la classe persona
        perona.setNombre(nombre);
        perona.setNacionalidad(nacionalidad);
        perona.setAltura(alt);
        perona.setEdad(edadPersona);
        
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre);
        JOptionPane.showMessageDialog(null, "Nacionalidad: " + nacionalidad);
        JOptionPane.showMessageDialog(null, "Altura: " + altura + " cm");
        JOptionPane.showMessageDialog(null, "Edad: " +  edad + " años");
        
        
    }
    
}
