
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erickson.vergara
 */
public class Graficos {
    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog("Introduzca el primer número");
        String n2 = JOptionPane.showInputDialog("Introduzca el segundo número");
        
        //como el tipo d evariable que me arroja los JOptionPane son de tipo String debo convertirlos para poder realizar las operaciones aritmeticas
        
        double num1 = Double.parseDouble(n1);
        double num2 = Double.parseDouble(n2);
        
        Operaciones op = new Operaciones();
        
        double suma = op.sumar(num1, num2);
        double resta = op.restar(num1, num2);
        double multiplicacion = op.multiplicar(num1, num2);
        double division = op.dividir(num1, num2);
        
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + suma);
        JOptionPane.showMessageDialog(null,"El resultado de la resta es: " + resta);
        JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es: " +  multiplicacion);
        JOptionPane.showMessageDialog(null, "El resultado de la division es: " + division);
        
    }
    
}
