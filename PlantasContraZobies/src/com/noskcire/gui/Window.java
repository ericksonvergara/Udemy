/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noskcire.gui;

import javax.swing.JFrame;

/**
 *
 * @author Usuario
 */
public class Window {
    
    public Window(){
        JFrame ventana = new JFrame();
        ventana.add(new VisualManager());
        ventana.setSize(1000, 1000);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        Window ventana = new Window();
    }
}
