/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noskcire.graphicsObjects;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class GreenBullet extends Graphic{
    
    public GreenBullet(int x, int y){
        super(x,y);
        icon = new ImageIcon(getClass().getResource("/images/green-bullet.png"));
        imgGraphic = icon.getImage();
    }
    
    @Override
    public void move(){
        xCoord += 30;
    }
    
    @Override
    public void draw(Graphics g){
        g.drawImage(imgGraphic, xCoord, yCoord, 30, 30, null);
    }
}
