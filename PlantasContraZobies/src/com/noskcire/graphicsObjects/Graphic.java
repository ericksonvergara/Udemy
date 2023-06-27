/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noskcire.graphicsObjects;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class Graphic {
    
    protected Image imgGraphic;
    protected ImageIcon icon;
    protected int xCoord;
    protected int yCoord;
    
    public  Graphic(int x, int y){ //Constructor de la clase Graphic que recibe las coordenadas del objeto
        xCoord = x;
        yCoord = y;                
    }
    
    public void move(){ //Metodo hace un desplazamiento en la coordenada x
        xCoord -= 10;
    }
    
    public void draw(Graphics g){ //Metodo que dibuja la imagen
        Graphics2D g2 = (Graphics2D)g;
        if(imgGraphic != null){
            g2.drawImage(imgGraphic, xCoord, yCoord, 80, 100, null);
        }
    }
    
}
