
import java.awt.Color;
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
public class DibujoArcoiris extends JPanel{
    
    //Definimos los colores Indigo y Violeta
    private final static Color VIOLETA = new Color(128, 0, 128);
    private final static Color INDIGO =  new Color (75, 0, 130);
    
    //Los Colores a usar en el arcoirrs, empezando desde los mas anteriores
    //las dos entradas de color blanco producen un arco vacio en el centro
    
    private Color[] colores = {Color.WHITE, Color.WHITE, VIOLETA, INDIGO, Color.blue, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED }; //Arreglo de objetos
    
    //Creamos el constructor de la clase
    public DibujoArcoiris(){
        setBackground(Color.WHITE);
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        int radio = 20;
        
        int centroX = getWidth() / 2;
        int centroY = getHeight() - 10;
        
        for(int contador = colores.length; contador > 0; contador--){
            //Establecer el color que usa el arco actual
            g.setColor(colores [ contador - 1]);
            
            //Rellenar el arco desde 0 hasta 180 grados.
            int valorX = centroX - contador * radio;
            int valorY = centroY - contador * radio;
            int ancho = contador * radio * 2;
            int alto = contador * radio * 2;
            
            g.fillArc(valorX, valorY, ancho, alto, 0, 180);
        }
    }
    
}
