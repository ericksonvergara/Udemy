/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    
    private double  salarioBase;

    public EmpleadoBaseMasComision(String nombre, String apellido, String nss, double ventas, double tarifa, double salario) {
        super(nombre, apellido, nss, ventas, tarifa);
        establecerSalarioBase(salario);
    }
    
    public void establecerSalarioBase(double salario){
        if(salario < 0.0){
            salario = 0.0;
        }else{
            salarioBase = salario; 
        }
    }
    
    public double obtenerSalarioBase(){
        return salarioBase;
    }
    
    public double ingresos(){
        return obtenerSalarioBase() + super.ingresos();
    }

    @Override
    public String toString() {
        return String.format("%s%s; %s: $%,.2f", "con salario base ", super.toString(), "salario base", obtenerSalarioBase());
    }
    
    
}
