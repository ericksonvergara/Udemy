
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erickson.vergara
 */
public class Operaciones {
    //int numero1;
    //int numero2;
    int sumar;
    int restar;
    int multiplicar;
    int dividir;
 
    /**
    public void leerNumeros(){
        Scanner sc = new Scanner(System.in); //Este metodo se activa para dar paso al usuario de ingresar por pantalla
        
        System.out.println("Escribir el primer número: ");
        numero1 = sc.nextInt(); //de esta forma se captura de lo que el usuario ingresa por pantalla.
        System.out.println("Escribir el segundo número: ");
        numero2 = sc.nextInt();
    }
    
    public void sumar(){
        sumar = numero1 + numero2;        
    }
    
    public void restar(){
        restar = numero1 - numero2;
    }
    
    public void multiplicar(){
        multiplicar = numero1 * numero2;
    }
    
    public void dividir(){
        dividir = numero1 / numero2;
    }
    
   public void imprimirResultados() { //Metodo imprimir resultados
       System.out.println("El resultado de la suma es: " +sumar);
       System.out.println("El resultado de la resta es: " + restar);
       System.out.println("El resultado de la multiplicación es: " + multiplicar);
       System.out.println("El resultado de la división es: " + dividir);
   }
   
   //Creando objeto de la clase
    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones(); //Objeto de la clase Operaciones
        
        operaciones.leerNumeros();//mandamos a llamar el metodo leer numeros mediante el objeto creado de la clase.
        operaciones.sumar();
        operaciones.restar();
        operaciones.multiplicar();
        operaciones.dividir();
        operaciones.imprimirResultados();
    }
    **/
    
    //METODOS: ARGUMENTOS Y PARAMETROS
    /**public void sumar(int numero1, int numero2){
        sumar = numero1 + numero2;
    }
    
    public void restar(int numero1, int numero2){
        restar = numero1 - numero2;
    }
    
    public void multiplicar(int numero1, int numero2){
        multiplicar = numero1 * numero2;
    }
    
    public void dividir(int numero1, int numero2){
        dividir = numero1 / numero2;
    }
    
    public void imprimirResultados() { //Metodo imprimir resultados
       System.out.println("El resultado de la suma es: " +sumar);
       System.out.println("El resultado de la resta es: " + restar);
       System.out.println("El resultado de la multiplicación es: " + multiplicar);
       System.out.println("El resultado de la división es: " + dividir);
   }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribir el primer número: ");
        int n1 = sc.nextInt();
        System.out.println("Escribir el segundo número: ");
        int n2 = sc.nextInt();
        
        Operaciones operaciones = new Operaciones();//Objeto de la clase Operaciones
        operaciones.sumar(n1, n2);
        operaciones.restar(n1, n2);
        operaciones.multiplicar(n1, n2);
        operaciones.dividir(n1, n2);
        
        operaciones.imprimirResultados();
    }**/
    
    //METODO RETORNO DE VALORES
    public int sumar(int numero1, int numero2){
        int sumar = numero1 + numero2;
        return sumar;
    }
    
    public int restar(int numero1, int numero2){
        int restar = numero1 - numero2;
        return restar;
    }
    
    public int multiplicar(int numero1, int numero2){
        int multiplicar = numero1 * numero2;
        return multiplicar;
    }
    
    public int dividir(int numero1, int numero2){
        int dividir = numero1 / numero2;
        return dividir;
    }
}
