/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Sobreescritura2 extends Sobreescritura{
    @Override
    public String toString(){
        return "Adios!";
    }
    public static void main(String[] args) {
        Sobreescritura2 obj = new Sobreescritura2();
        System.out.println(obj.toString());
    }
}
