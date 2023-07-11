
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erickson.vergara
 */
public class Label extends JFrame{

    public Label() {
        JLabel etiqueta = new JLabel("Java");
        JLabel etiqueta2 = new JLabel(new ImageIcon("java.jpg"));
        
        etiqueta.setBounds(200,200,50,20);
        
        add(etiqueta);
        add(etiqueta2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Label obj = new Label();
    }
        
}
