
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erickson.vergara
 */
public class TextField extends JFrame{

    public TextField() {
        JTextField jt = new JTextField("Nombre", 100);
        jt.setBounds(150,200,150,30);
        
        JTextField jt2 = new JTextField("Apellido", 100);
        jt2.setBounds(150,250,150,30);
        
         jt2.setBounds(150,250,150,30);
        
        jt.setText("Opcion 1");
        System.out.println(jt.getText());
        //jt.setEnabled(false);       
        
        add(jt);
        add(jt2);
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        TextField obj = new TextField();
    }
}
