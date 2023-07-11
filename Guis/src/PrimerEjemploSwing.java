
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erickson.vergara
 */
public class PrimerEjemploSwing {
    public static void main(String[] args) {
        JFrame f = new JFrame(); //Creando una instancia de JFrame
        
        JButton b = new JButton("Click"); //Creando una instancia de JButton
        b.setBounds(130,130,100,40); //ejes x, y, ancho y alto
        
        f.add(b); //Añadiendo el boton al JFrame
        
        f.setSize(400,500); //Asignandole un tamaño al JFrame
        f.setLayout(null); //No usaremos Layouts managers
        f.setVisible(true); //hHacemos el frame visible       
    }
}