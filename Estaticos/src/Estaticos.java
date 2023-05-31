/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erickson.vergara
 */
public class Estaticos {
  
    static  String atrib = "Atributo";
    
    public static int sumar(int x, int y) {
        int suma = x + y;
        return suma;        
    }
    
    public static void main(String[] args) {
        Estaticos est1 = new Estaticos();//Objetos de la clase
        Estaticos est2 = new Estaticos();//Objetos de la clase
        
        /*
        est1.atrib = "Atributo cambiado";//se ha cambiado el valor del atributo
        String var1 = est1.atrib;// el valor del atributo cambiado se le asigno a la varia ble var 1
        String var2 = est2.atrib;// el valor de la variable var2 no ha cambiado
        */
        est1.atrib = "Atributo cambiado";
        
        est2.atrib = "Valor estatico";
        
        Estaticos est3 = new Estaticos();
        est3.atrib = "Otro cambio";
        
        System.out.println("variable1 es: " + est1.atrib);
        System.out.println("variable2 es: " + est2.atrib);
        
        int suma = Estaticos.sumar(5, 10);
        
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("Variable de clase: " + Estaticos.atrib);
    }
}
