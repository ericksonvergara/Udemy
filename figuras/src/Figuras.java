
import java.awt.Graphics;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Figuras extends JPanel{
    
    //Con esta variable el usuario elegira que figura dibujar
    private int opcion;
    
    //El constructor va a establecer la opcion del usuario
    public Figuras(int opcionUsuario){
        opcion = opcionUsuario;
    }//fin del constructor Figuras
    
    //Este metodo dibuja una cascada de figuras, empe<ando desde la esquina superior izquierda
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        
        for (int i = 0; i < 10; i++) {
            
            switch (opcion) {
                case 1: //dibuja rectangulo
                        int xRect = 10 + i * 10;
                        int yRect = 10 + i * 10;
                        int anchoRect = 50 + i * 10;
                        int altoRect = 50 + i * 10;
                        g.drawRect(xRect, yRect, anchoRect, altoRect);                    
                    break;
                case 2:// dibuja ovalos
                    int xOval = 10 + i * 10;
                    int yOval = 10 + i * 10;
                    int anchoOval = 50 + i * 10;
                    int altoOval = 50 + i * 10;
                    g.drawOval(xOval, yOval, anchoOval, altoOval);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
