
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erickson.vergara
 */
public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        do{
            System.out.println("Ingrese un valor entre 0 y 999 (0 finaliza): ");
            valor = sc.nextInt();
            if (valor>=100) {
                System.out.println("Tiene 3 dígitos");
            }else{
                if(valor>=10){
                    System.out.println("Tiene 2 dígitos");
                }
                else{
                    System.out.println("Tiene 1 dígito");
                }
            }
        }while(valor!=0);
    }
    
}
