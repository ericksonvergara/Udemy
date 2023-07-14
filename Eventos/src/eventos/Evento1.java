/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author erickson.vergara
 */
public class Evento1 extends JFrame {

    public Evento1() {
        
        JLabel lblMovedx = new JLabel("Moved x: ");
        lblMovedx.setBounds(25, 10, 100, 30);
        
        
        JLabel lblSaludo = new JLabel();
        lblSaludo.setBounds(25, 10, 250, 30);

        JLabel lblInstruccion = new JLabel("Ingresa tu nombre");
        lblInstruccion.setBounds(25, 165, 200, 30);

        JTextField campoSaludo = new JTextField(200);
        campoSaludo.setBounds(25, 200, 200, 30);

        JButton boton = new JButton("¡Saludar!");
        boton.setBounds(25, 235, 150, 30);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblSaludo.setText("Hola " + campoSaludo.getText());
            }
        };
        boton.addActionListener(listener);
        
        MouseListener mListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getSource() == campoSaludo){
                    lblSaludo.setText("MouseClickek dentro del campo saludo");
                }
                if(e.getSource() == boton){
                    lblSaludo.setText("MouseClickek");
                }
                if(e.isAltDown()){
                    System.out.println("alt");
                } else if(e.isControlDown()){
                    System.out.println("control");
                } else if(e.isShiftDown()){
                    System.out.println("shift");
                } else if(e.isMetaDown()){
                    System.out.println("clic derecho");
                } else{
                    System.out.println("clic izquierdo");
            }
                
                if(e.getClickCount() == 2){
                    System.out.println("doble clic");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if(e.getSource() == campoSaludo){
                    lblSaludo.setText("MousePressed dentro de campo saludo");
                }
                if(e.getSource() == boton){
                    lblSaludo.setText("MousePressed");
                }                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if(e.getSource() == campoSaludo){
                    lblSaludo.setText("MouseRelease dentro de campo saludo");
                }
                if(e.getSource() == boton){
                    lblSaludo.setText("MouseRelease");
                }                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if(e.getSource() == campoSaludo){
                    lblSaludo.setText("MouseEntered dentro de campo saludo");
                }
                if(e.getSource() == boton){
                    lblSaludo.setText("MouseEntered");
                }                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if(e.getSource() == campoSaludo){
                    lblSaludo.setText("MouseExited dentro de campo saludo");
                }
                if(e.getSource() == boton){
                    lblSaludo.setText("MouseExited");
                }                
            }
        };
        
        MouseWheelListener whell = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
               // System.out.println("mouse wheel");
               if(e.getPreciseWheelRotation() == -1){
                   System.out.println("rueda hacia arribiba");
               } if(e.getPreciseWheelRotation() == 1){
                   System.out.println("rueda hacia abajo");
               }
            }
        };
        
        MouseMotionListener motionListener = new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("draged");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println("moved");
            }
        };
                
                boton.addMouseListener(mListener);
                campoSaludo.addMouseListener(mListener);
                campoSaludo.addMouseWheelListener(whell);
                this.addMouseMotionListener(motionListener);

        add(lblSaludo);
        add(lblInstruccion);
        add(campoSaludo);
        add(boton);
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Evento1 obj = new Evento1();
    }

}
