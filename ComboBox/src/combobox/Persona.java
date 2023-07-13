/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package combobox;

/**
 *
 * @author Usuario
 */
public class Persona {
    String nombre;
    String direccion;
    String nacionalidad;
    int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direcion) {
        this.direccion = direccion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        //return "Persona{" + "nombre=" + nombre + ", direcion=" + direcion + ", nacionalidad=" + nacionalidad + ", edad=" + edad + '}';
        return this.nombre;
//               this.direccion,
//               this.nacionalidad,
//               this.edad;
    }
    
    
    
}
