
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.border.Border;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erickson.vergara
 */
public class TextArea extends JFrame{

    public TextArea() {
        JTextArea ta = new JTextArea(200, 200);
        ta.setBounds(130, 125, 200, 200);
        
        Border border = BorderFactory.createLineBorder(Color.BLACK); // Puedes elegir el color y estilo del borde
        ta.setBorder(border);
        
         ta.setText("Opcion 1");
        System.out.println(ta.getText());
        //ta.setEnabled(false);
        
        add(ta);
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        TextArea obj = new TextArea();
    }
    
}
