/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erickson.vergara
 */
public class EmpleadoPorHoras extends Empleado {
    
    private double sueldo;  //Sueldo por horas
    private double horas;  //Horas trabajadas

    public EmpleadoPorHoras(String nombre, String apellido, String nss, double salarioPorHoras, double horasTrabajadas) {
        super(nombre, apellido, nss);
        establacerSueldo(salarioPorHoras);
        establaecerHoras(horasTrabajadas);
    }
    
    public double obtenerSueldo(){
        return sueldo;
    }
    
    public void establacerSueldo(double su){
        if(su < 0.0){
            sueldo = 0.0;
        }else{
            sueldo = su;
        }        
    }
    
    public double obtenerHoras(){
        return horas;
    }
    
    public void establaecerHoras(double h){
        if((h >= 0) && (h <= 168)){
            horas = h;
        }else{
            horas = 0;
        }       
    }
    
    public String toString(){
        return String.format("Empleado por horas: %s\n%s: $%,.2f", super.toString(), "sueldo por hora", obtenerSueldo(), "horas trabajadas", obtenerHoras());
    }
    
    public double ingresos(){
        if(obtenerHoras() <= 40){
            return obtenerSueldo() * obtenerHoras();
        }else{
            return 40 * obtenerSueldo() + (obtenerHoras() - 40) * obtenerSueldo() * 1.5;
        }
    }
}
