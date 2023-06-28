/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class PruebaSistemaNomina {

    public static void main(String[] args) {
        //Argumentos: Nombre, Apellido, Nss y Salario.
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Juan", "Perez", "111-11-1111", 800.00);

        //Argumentos: Nombre, Apellido, Nss y Sueldo por horas y Horas trabajadas.
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Alicia", "Ramirez", "222-22-2222", 16.75, 40);

        //Argumentos: Nombre, Apellido, Nss, Ventas brutas y Tarifa comisión.
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Jorge", "Rodriguez", "333-33-3333", 10000, .06);

        //Argumentos: Nombre, Apellido, Nss, Ventas brutas, Tarifa comisión y Salario base.
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Javier", "Vazquez", "444-44-4444", 5000, .04, 300);

        System.out.println("Empleados procesador por separado:\n");
        
        System.out.printf("%s\n%s; $%,.2f\n\n", empleadoAsalariado, "ingresos", empleadoAsalariado.ingresos());
        System.out.printf("%s\n%s; $%,.2f\n\n", empleadoPorHoras, "ingresos", empleadoPorHoras.ingresos());
        System.out.printf("%s\n%s; $%,.2f\n\n", empleadoPorComision, "ingresos", empleadoPorComision.ingresos());
        System.out.printf("%s\n%s; $%,.2f\n\n", empleadoBaseMasComision, "ingresos", empleadoBaseMasComision.ingresos());
    }
}
