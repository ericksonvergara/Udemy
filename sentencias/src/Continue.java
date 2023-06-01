/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Continue {
    public static void main(String[] args) {
        int cuenta;
        
        for(cuenta = 1; cuenta <= 10; cuenta++){
            if (cuenta == 5) {
                continue;
            }
            if (cuenta == 6){
                continue;
            }
            System.out.println("Cuenta es: " + cuenta);
            System.out.println("Impresion despues del valor");
        }
        System.out.println("Salio del ciclo en cuenta = " + cuenta);
    }
}
