/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noskcire.gui;

import com.noskcire.graphicsObjects.Zoombie;
import com.noskcire.graphicsObjects.Graphic;
import com.noskcire.graphicsObjects.GreenBullet;
import com.noskcire.graphicsObjects.SilverBullet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.TimerTask;
import javax.swing.JPanel;
import java.util.Timer;

/**
 *
 * @author Usuario
 */
public class VisualManager extends JPanel {

    private ArrayList<Graphic> graphicList;

    public VisualManager() {
        setSize(500, 500);
        setBackground(Color.WHITE);

        graphicList = new ArrayList<Graphic>();

        graphicList.add(new Zoombie(900, 10));
        graphicList.add(new Zoombie(850, 100));
        graphicList.add(new Zoombie(800, 200));
        graphicList.add(new Zoombie(910, 300));
        graphicList.add(new Zoombie(920, 400));
        graphicList.add(new Zoombie(850, 500));
        graphicList.add(new Zoombie(710, 600));
        graphicList.add(new Zoombie(860, 700));
        graphicList.add(new Zoombie(900, 800));
        graphicList.add(new GreenBullet(10, 10));
        graphicList.add(new GreenBullet(15, 50));
        graphicList.add(new GreenBullet(25, 90));
        graphicList.add(new GreenBullet(5, 140));
        graphicList.add(new GreenBullet(9, 190));
        graphicList.add(new GreenBullet(13, 240));
        graphicList.add(new GreenBullet(16, 290));
        graphicList.add(new SilverBullet(1, 350));
        graphicList.add(new SilverBullet(5, 400));
        graphicList.add(new SilverBullet(30, 450));
        graphicList.add(new SilverBullet(10, 500));
        graphicList.add(new SilverBullet(10, 550));
        graphicList.add(new SilverBullet(0, 600));
        graphicList.add(new SilverBullet(-2, 650));
        graphicList.add(new SilverBullet(15, 700));
        graphicList.add(new GreenBullet(13, 750));
        graphicList.add(new GreenBullet(16, 800));
        graphicList.add(new SilverBullet(1, 852));
        graphicList.add(new SilverBullet(15, 900));

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                moveGraphics();
                repaint();
            }
        };
        
        Timer timer = new Timer();
        timer.schedule(timerTask, 0, 1000);
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        for(Graphic graphic : graphicList){
            graphic.draw(g);
        }
    }
    
    public void moveGraphics(){
        for(Graphic g : graphicList){
            g.move();
        }
    }
}
