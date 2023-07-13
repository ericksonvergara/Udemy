/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package combobox;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author Usuario
 */
public class Ventana extends JFrame{

    public Ventana() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        JComboBox combo = new JComboBox(modelo);
        combo.setBounds(100, 200, 250, 40);
        
        // Creamos un objeto de la clase persona que esta en el mismo paquete
        Persona p = new Persona();
        p.setNombre("Erick Eduaro");
        p.setDireccion("Av 5 #27-17");
        p.setNacionalidad("Colombiano");
        p.setEdad(18);
        
        // Creamos otro objeto de la clase persona que esta en el mismo paquete
        Persona p1 = new Persona();
        p1.setNombre("Weimar Eduaro");
        p1.setDireccion("Av 5 #27-17");
        p1.setNacionalidad("Colombiano");
        p1.setEdad(18);
        
        // Creamos otr objeto de la clase persona que esta en el mismo paquete
        Persona p2 = new Persona();
        p2.setNombre("Wilson Eduaro");
        p2.setDireccion("Av 5 #27-17");
        p2.setNacionalidad("Colombiano");
        p2.setEdad(18);
        
        
        //Añadimos el objeto qu acabamos de crear al combobox
        modelo.addElement(p);
        modelo.addElement(p1);
        modelo.addElement(p2);
        add(combo);
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
       
    public static void main(String[] args) {
        Ventana obj = new Ventana();
    }
}
