/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

/**
 *
 * @author erickson.vergara
 */
public class Listas extends JFrame {

    public Listas() {

        DefaultListModel<Persona> modelo = new DefaultListModel<Persona>();// Esta clase contiene Datos de tipo persona
        JList lista = new JList(modelo); // Objeto de JLista
        lista.setBounds(100, 100, 200, 300);

        modelo.addElement(new Persona("Erick Eduardo", "calle 10 0N 77", "1092969617"));
        modelo.addElement(new Persona("Ana María", "avenida 5 0E 24", "2154896321"));
        modelo.addElement(new Persona("Juan Pérez", "carrera 7 0S 12", "3158749658"));
        modelo.addElement(new Persona("María Rodríguez", "calle 15 0N 45", "4087259631"));
        modelo.addElement(new Persona("Carlos Gómez", "carrera 3 0E 9", "5124879632"));
        modelo.addElement(new Persona("Laura Ramírez", "avenida 8 0S 21", "6079841257"));
        modelo.addElement(new Persona("Pedro López", "calle 12 0N 33", "7085124698"));
        modelo.addElement(new Persona("Sofía Torres", "carrera 9 0E 18", "8159632475"));
        modelo.addElement(new Persona("Andrés Sánchez", "calle 6 0N 56", "9125368749"));
        modelo.addElement(new Persona("Erick Eduardo", "calle 10 0N 77", "1092969617"));
        modelo.addElement(new Persona("Ana María", "avenida 5 0E 24", "2154896321"));
        modelo.addElement(new Persona("Juan Pérez", "carrera 7 0S 12", "3158749658"));
        modelo.addElement(new Persona("María Rodríguez", "calle 15 0N 45", "4087259631"));
        modelo.addElement(new Persona("Carlos Gómez", "carrera 3 0E 9", "5124879632"));
        modelo.addElement(new Persona("Laura Ramírez", "avenida 8 0S 21", "6079841257"));
        modelo.addElement(new Persona("Pedro López", "calle 12 0N 33", "7085124698"));
        modelo.addElement(new Persona("Sofía Torres", "carrera 9 0E 18", "8159632475"));
        modelo.addElement(new Persona("Andrés Sánchez", "calle 6 0N 56", "9125368749"));
        modelo.addElement(new Persona("Luisa González", "avenida 2 0S 14", "1025478963"));
        modelo.addElement(new Persona("Javier Castro", "carrera 4 0E 11", "1147852369"));
        modelo.addElement(new Persona("Carolina Herrera", "calle 14 0N 29", "1258749632"));
        modelo.addElement(new Persona("Mario Vargas", "avenida 11 0S 8", "1385962478"));
        
        JScrollPane scroll = new JScrollPane(lista);
        scroll.setBounds(10, 10, 200, 250);
        
        add(scroll);
        setSize(300, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Listas obj = new Listas();
    }

}
