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
        
        //Polimorfismo
        Empleado [] empleados = new Empleado[4];
        
        empleados[ 0 ] = empleadoAsalariado;
        empleados[ 1 ] = empleadoPorHoras;
        empleados[ 2 ] = empleadoPorComision;
        empleados[ 3 ] = empleadoBaseMasComision;
        
        System.out.println("Empleados procesados en forma poliformica");
        
        //Procesa en forma generica a cada elemento en el arreglo empleados
        for (Empleado empleadoActual : empleados) {
            System.out.println(empleadoActual); //Invoca al metodo toString
            
            if (empleadoActual instanceof EmpleadoBaseMasComision) {
                
                /*Conversión descendiente de la referencia empleado
                a una referencia de EmpleadoBasePorComision*/
                EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) empleadoActual;
                
                double salarioBaseAnterior = empleado.obtenerSalarioBase();
                empleado.establecerSalarioBase(1.10 * salarioBaseAnterior);
                
                System.out.printf("El nuevo salario base con 10%% de aumento es : $%,.2f\n", empleado.obtenerSalarioBase());
            }//Fin del if
            System.out.printf("ingresos $%,.2f\n\n", empleadoActual.ingresos());
        }
        
        //Obtiene el nombre del tipo de cada objeto en el arreglo empleados
        for (int j = 0; j < empleados.length; j++) {
            System.out.printf("El empleado %d es un %s\n", j, empleados[ j ].getClass().getName());
        }
    }
}
