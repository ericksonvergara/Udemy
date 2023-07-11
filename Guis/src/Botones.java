
import javax.swing.ImageIcon;
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
public class Botones extends JFrame{

    public Botones() {
        JButton boton = new JButton(new ImageIcon("comprobad.png"));
        
        boton.setBounds(130,130,100,40);        
        boton.setText("OK");
        System.out.println("Texto del boton: " + boton.getText());
        //boton.setEnabled(false);
        //boton.setIcon(new ImageIcon("comprobad.png"));
        boton.setMnemonic('m');
        
        
        add(boton);        
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Botones obj = new Botones();
    }
    
}
