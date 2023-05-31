/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erickson.vergara
 */
public class Sobrecargados {
    
    public void sumar(){
        System.out.println("Este metodo no recibe parametros");
    }
    
    public void sumar(int x, int y){
        System.out.println("Este metodo recibe dos enteros");
    }
    
    public void sumar(int x){
        System.out.println("Este metodo recibe 1 entero");
    }
    
    public void sumar(double x){
        System.out.println("Este metodo recibe un decimal");
    }
    
    public static void main(String[] args) {
        Sobrecargados sobreC = new Sobrecargados();
        
        sobreC.sumar(2.5);
        
    }
    
}
