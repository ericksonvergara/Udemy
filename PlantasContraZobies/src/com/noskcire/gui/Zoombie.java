/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noskcire.gui;

import com.noskcire.graphicsObjects.Graphic;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class Zoombie extends Graphic{
    
    public Zoombie(int x, int y){
        super(x,y);
        icon = new ImageIcon(getClass().getResource("/images/Plants-vs-Zombies-2-14.jpg"));
        imgGraphic = icon.getImage();
    }
    
    @Override
    public void move(){
        xCoord -= 15;
    }
    
    @Override
    public void draw(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(imgGraphic, xCoord, yCoord, 80, 110, null);
    }
}
