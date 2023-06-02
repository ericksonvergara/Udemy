
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class PruebaFiguras {
    public static void main(String[] args) {
        //Obtener desicion de usuario
       String entrada = JOptionPane.showInputDialog("Escriba 1 para dibujar Rectangulo / 2.Escriba 2 para dibujar ovalo");
       
       int opcion = Integer.parseInt(entrada);
       Figuras fig = new Figuras(opcion);
        JFrame ventana = new JFrame();
        
        
        ventana.add(fig);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300, 300);
        ventana.setSize(300, 300);
       ventana.setVisible(true);
      
       
    }
    
}