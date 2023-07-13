
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erickson.vergara
 */
public class RadioButton extends JFrame{

    public RadioButton() {
        JRadioButton rb = new JRadioButton("opcion 1", true);
        JRadioButton rb2 = new JRadioButton("opcion 2", false);
        
        rb.setText("Hombre");
        System.out.println(rb.getText());
        rb.setIcon(new ImageIcon("comprobad.png"));
        rb.setMnemonic('m');
        
        System.out.println("El valor es: " + rb.isSelected());
        
        rb.setBounds(50, 100, 100, 30);
        rb2.setBounds(50, 150, 100,30);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb);
        bg.add(rb2);
        
        add(rb);
        add(rb2);
        
        setSize(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);        
    }
    
    public static void main(String[] args) {
        RadioButton obj = new RadioButton();
    }
    
}
