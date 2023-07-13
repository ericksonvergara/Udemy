
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erickson.vergara
 */
public class ToggleButton extends JFrame{

    public ToggleButton() {
        JToggleButton tb = new JToggleButton("ToggleButton", true); 
        JToggleButton tb2 = new JToggleButton("ToggleButton", false);
        tb.setBounds(150,200,150,30);
        tb2.setBounds(150,250,150,30);
        
        tb.setText("Opcion 1");
        System.out.println(tb.getText());
        //tb.setEnabled(false);
        tb.setIcon(new ImageIcon("comprobad.png"));
        tb.setMnemonic('m');
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(tb);
        bg.add(tb2);
        
        add(tb);
        add(tb2);
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);        
    }
    
    public static void main(String[] args) {
        ToggleButton obj = new ToggleButton();
    }
    
}
