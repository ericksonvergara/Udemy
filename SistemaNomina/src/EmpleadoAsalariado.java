

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erickson.vergara
 */
public class EmpleadoAsalariado extends Empleado{
    
    private double salario;

public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario){
    super(nombre, apellido, nss);
    establecerSalarioSemana(salario);
}
    
    public double ingresos(){
        return obtenerSalarioSemanal();
    }
    
    public void establecerSalarioSemana(double sal){
        salario = sal;
    }
    
    public double obtenerSalarioSemanal(){
        return salario;
    }
    
    public String toString(){
        return String.format("Empleado asalariado: %s\n%s: $%,.2f", super.toString(), "Salario Semanal", obtenerSalarioSemanal());
    }
}
