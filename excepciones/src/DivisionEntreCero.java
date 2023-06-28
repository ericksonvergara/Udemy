
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author erickson.vergara
 */
public class DivisionEntreCero {

    //demuestra el lanzamiento de una excepcion cuando ocurre una division por cero
    public static int cociente(int numerador, int denominador)
          //  throws ArithmeticException
            //Realizamos validaciones para no tener que mostrar el error.
    {
        if(denominador == 0){
            System.out.println("Introduce un número distinto a Cero.");
        }
        return numerador / denominador; //posible divison entre cero
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Objeto scanner para la enterada de los números
        boolean continuarCiclo = true; // determina si se necesitan mas datos de entrada

        do {
            try {
                System.out.println("Ingrese el numerador");
                int numerador = sc.nextInt();

                System.out.println("Ingrese el denominador");
                int denominador = sc.nextInt();

                int resultado = DivisionEntreCero.cociente(numerador, denominador);

                System.out.println("El resultado de: " + numerador + " / " + denominador + " = " + resultado);
                continuarCiclo = false; // si no hay ninguna excepcion termian el fujo del programa
                
            } catch (InputMismatchException exception) {
                System.err.println("Se produjo una excepcion: " + exception);
                sc.nextLine(); //Descarta la entrada anterior para que el usuario intente de nuevo.
                
                System.out.println("Debe introducir números enteron. Intente nuevamente. \n");
            } //fin del catch InputMismatchException
            catch(ArithmeticException exception){
                System.err.println("\nExcepcion " + exception);
                System.out.println("Cero es un denominador inválido. Intente de nuevo. \n");
            } // FIn del catch
        }while(continuarCiclo);       
    }
}
