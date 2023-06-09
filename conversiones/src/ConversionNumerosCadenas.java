
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erickson.vergara
 */
public class ConversionNumerosCadenas {

    public static void main(String[] args) {
        //Numeros a cadenas de caracteres
        int i = 5;
        byte b = 10;
        short s = 60;
        double d = 25.4;
        float f = 9.63f;

        String sI = "" + i;
        String sB = Byte.toString(b);
        String sO = String.valueOf(d);
        String sS = Double.toString(d);
        String sD = Short.toString(s);
        String sF = String.valueOf(f);
        
        JOptionPane.showMessageDialog(null, "Hola " + sS);
        
        //Cadenas de caracteres a números
        String valor = JOptionPane.showInputDialog("Introduzca un número: " );
        int valor1 = Integer.parseInt(valor); //Convertimos el numero ingresado por el usuario a entero por medio del metodo ParseInt
        double valor2 = Double.parseDouble(valor);
        int suma = valor1 + 5;
        double suma2 = valor2 + 5;
        System.out.println("El resultado de la suma con variable int es: "+suma);
        System.out.println("El resultado de la suma con variable Double es: "+suma2);
    }
}
