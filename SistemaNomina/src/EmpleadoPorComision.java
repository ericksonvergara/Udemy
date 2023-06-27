/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erickson.vergara
 */
public class EmpleadoPorComision extends Empleado{
    
    private double ventasBrutas;
    private double tarifaComision;
    
    public EmpleadoPorComision(String nombre, String apellido, String nss, double ventas, double tarifa){
        super(nombre, apellido, nss);
        establecerVentasBrutras(ventas);
        establecerTarifaComision(tarifa);
    }
    
    public void establecerTarifaComision(double tarifa){
        if(tarifa > 0.0 && tarifa < 1.0){
            tarifaComision = tarifa;
        }else{
            tarifa = 0.0;
        }
    }
    
    public double obtenerTarifaComision(){
        return tarifaComision;
    }
    
    public void establecerVentasBrutras(double ventas){
        if(ventas > 0.0){
            ventasBrutas = 0.0;
        }else{
            ventasBrutas = ventas;
        }
    }
    
    public double obtenerVentasBrutas(){
        return ventasBrutas;
    }
    
    public double ingresos(){
        return obtenerTarifaComision() * obtenerVentasBrutas();
    }
    
    public String toString(){
        return String.format("%s: %s\n%s: $%, .2f; %s: %.2f", "empleado por comisión", super.toString(), "ventas brutas", obtenerVentasBrutas(), 
                "tarifa de comision", obtenerTarifaComision());
    }
}
