
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class PruebaException {
    private int numero;
    Scanner sc = new Scanner(System.in);
    
    private void introducirNumero() throws NumeroCeroException{
        do {            
            System.out.println("Introducir un número:");
            numero = sc.nextInt();
            
            if (numero==0) {
                throw new NumeroCeroException();
            }
        } while (numero != 0);
    }
    
    public static void main(String[] args) {
        try {
            new PruebaException().introducirNumero();
        } catch (NumeroCeroException e) {
            System.out.println("Es un número 0");
        }
        
    }
}
