
import javax.swing.JComboBox;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erickson.vergara
 */
public class ComboBox extends JFrame{

    public ComboBox() {
        String[] paises = {
                "Argentina",
                "Bolivia",
                "Brasil",
                "Chile",
                "Colombia",
                "Ecuador",
                "Guyana",
                "Paraguay",
                "Perú",
                "Surinam",
                "Uruguay",
                "Venezuela"
        };
        JComboBox cb = new JComboBox(paises);
        cb.setBounds(150,150,200,30);
        
        add(cb);
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        ComboBox obj = new ComboBox();
    }
}
