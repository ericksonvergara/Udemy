/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Sobreescritura {
    @Override
    public String toString(){
        return "Hola";
    }
    public static void main(String[] args) {
        Sobreescritura obj = new Sobreescritura();
        System.out.println(obj.toString());
    }
    
    
}
