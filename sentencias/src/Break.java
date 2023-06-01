/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Break {
    public static void main(String[] args) {
        int cuenta;
        
        for(cuenta = 1; cuenta <= 10; cuenta++){
            if (cuenta == 5) {
                break;
            }
            System.out.println("Cuenta es: " + cuenta);
        }
        System.out.println("Salio del ciclo en cuenta = " + cuenta);
    }
    
}
