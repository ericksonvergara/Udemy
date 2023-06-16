/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pantasvszombies;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Usuario
 */
public class AdminV {
    
private ArrayList<ObjetoGrafico> listaFiguras; //Se crea una objeto llamado listaFiguras de tipo ArrayList

public AdminV(){ // Se crea un  constructor de la clase AdminV
    
    listaFiguras = new ArrayList<ObjetoGrafico>(); //Confirmo que se van a crear objetos de tipo grafico
    //acontinuacion estamos llenado diccho arreglo con algunos objetos que heredan de la clase Objetografico
    listaFiguras.add(new BalaPlata("Plata1"));
    listaFiguras.add(new BalaPlata("Plata2"));
    listaFiguras.add(new BalaPlata("Plata3"));
    listaFiguras.add(new BalaVerde("Verde1"));
    listaFiguras.add(new Zoombie("Jake"));
    listaFiguras.add(new Zoombie("Herman"));
    listaFiguras.add(new Zoombie("Peter"));
    listaFiguras.add(new BalaVerde("Verde2"));
    
    //creamos un objeto de tipo timer para que inicie una tarea al tiempo que yo le pase
    
    TimerTask timerTask = new TimerTask() { // creo un objeto de la clase TimerTask
        @Override
        public void run() {
            moverFiguras();
        }
    };
    
    Timer timer = new Timer(); //creamos un objeto de tipo Timer
    timer.schedule(timerTask, 0, 5000);
}

    public void moverFiguras(){ // Creacion del metodo moverFiguras
        // por medio de este ciclo for recorremos los elementos del arrayList listaFiguras y los guardamos en el objeto og
        for(ObjetoGrafico og: listaFiguras){ 
            og.mover();
        }
        
        System.out.println("---------------------------------------");
}
    
    public static void main(String[] args) {
        AdminV admin = new AdminV();
    }
}
