
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Usuario
 */
public class Tablas extends JFrame {

    public Tablas() {

        super("tablas");

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Direccion");
        modelo.addColumn("Edad");
        modelo.addColumn("Telefono");

        String[] persona1 = {"Erick Vergara", "Av 5 #27-17", "18 M", "3143158027"};
        String[] persona2 = {"María López", "Calle 10 #15-30", "25", "3012345678"};
        String[] persona3 = {"Carlos García", "Avenida Principal #45", "40", "3209876543"};
        String[] persona4 = {"Ana Torres", "Carrera 7 #12-34", "32", "3176543210"};
        String[] persona5 = {"Luisa Martínez", "Calle 20 #8-15", "28", "3101234567"};
        String[] persona6 = {"Pedro Gómez", "Avenida Central #60", "45", "3009876543"};
        String[] persona7 = {"Sofía Vargas", "Carrera 15 #30-25", "22", "3134567890"};
        String[] persona8 = {"Laura Ramírez", "Calle 25 #40-10", "35", "3187654321"};
        String[] persona9 = {"María López", "Calle 10 #15-30", "25", "3012345678"};
        String[] persona10 = {"Carlos García", "Avenida Principal #45", "40", "3209876543"};
        String[] persona11 = {"Ana Torres", "Carrera 7 #12-34", "32", "3176543210"};
        String[] persona12 = {"Luisa Martínez", "Calle 20 #8-15", "28", "3101234567"};
        String[] persona13 = {"Pedro Gómez", "Avenida Central #60", "45", "3009876543"};
        String[] persona14 = {"Sofía Vargas", "Carrera 15 #30-25", "22", "3134567890"};
        String[] persona15 = {"Laura Ramírez", "Calle 25 #40-10", "35", "3187654321"};
        String[] persona16 = {"Juan Rodríguez", "Av 8 #10-20", "31", "3223456789"};
        String[] persona17 = {"Marta Sánchez", "Calle 12 #5-18", "29", "3156789012"};
        String[] persona18 = {"Andrés Castro", "Avenida Norte #30", "42", "3104567890"};
        String[] persona19 = {"Lucía Gutiérrez", "Carrera 9 #15-25", "26", "3178901234"};
        String[] persona20 = {"Roberto Ríos", "Calle Sur #50-12", "37", "3132345678"};
        String[] persona21 = {"Diana Herrera", "Av 7 #22-18", "33", "3190123456"};
        String[] persona22 = {"Alejandro Muñoz", "Carrera 5 #8-15", "39", "3167890123"};
        String[] persona23 = {"Camila López", "Calle 18 #30-20", "23", "3112345678"};
        String[] persona24 = {"Ricardo Gómez", "Avenida Oeste #25", "47", "3145678901"};
        String[] persona25 = {"Paula Torres", "Carrera 14 #12-30", "30", "3123456789"};
        String[] persona26 = {"Héctor Ramírez", "Av 6 #18-12", "36", "3189012345"};
        String[] persona27 = {"Isabella Gómez", "Calle 22 #35-40", "27", "3105678901"};
        String[] persona28 = {"Gabriel González", "Carrera 11 #40-25", "34", "3150123456"};
        String[] persona29 = {"Valentina Pérez", "Calle 14 #20-35", "21", "3193456789"};

        //Metodo para 
        modelo.addRow(persona1);
        modelo.addRow(persona2);
        modelo.addRow(persona3);
        modelo.addRow(persona4);
        modelo.addRow(persona5);
        modelo.addRow(persona6);
        modelo.addRow(persona7);
        modelo.addRow(persona8);
        modelo.addRow(persona9);
        modelo.addRow(persona10);
        modelo.addRow(persona11);
        modelo.addRow(persona12);
        modelo.addRow(persona13);
        modelo.addRow(persona14);
        modelo.addRow(persona15);
        modelo.addRow(persona16);
        modelo.addRow(persona17);
        modelo.addRow(persona18);
        modelo.addRow(persona19);
        modelo.addRow(persona20);
        modelo.addRow(persona21);
        modelo.addRow(persona22);
        modelo.addRow(persona23);
        modelo.addRow(persona24);
        modelo.addRow(persona25);
        modelo.addRow(persona26);
        modelo.addRow(persona27);
        modelo.addRow(persona28);
        modelo.addRow(persona29);
        
        JTable tabla = new JTable(modelo);
        tabla.setBounds(10, 20, 500, 500);

        JScrollPane scroll = new JScrollPane(tabla);
        //scroll.add(tabla);
        scroll.setBounds(10, 20, 500, 300);

        add(scroll);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        Tablas obj = new Tablas(); 
    }

}
