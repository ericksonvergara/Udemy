
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erickson.vergara
 */
public class Dialogos {
    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Operacion realizada correctamente");
        JOptionPane.showMessageDialog(null, "Operacion realizada correctamente", "Titulo ventana", JOptionPane.WARNING_MESSAGE);
        String nombre = JOptionPane.showInputDialog("Escribe tu nombre");
        JOptionPane.showMessageDialog(null, "Hola " +  nombre);
    }
    
}
