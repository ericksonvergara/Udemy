

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erickson.vergara
 */
//clase abstracta
public abstract class Empleado {
    
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    
    //Contructor con tres argumentos
    public Empleado(String nombre, String apellido, String nss){
        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = nss;
    } //Fin del constructor Empleado

    //Getters and Setters
    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }    

    //Devuelve la represenstación de String de un objeto empleado
    @Override
    public String toString() {
     return String.format("%s  %s\nNúmero de seguridad social: %s", getPrimerNombre(), getApellidoPaterno(), getNumeroSeguroSocial());
    } 
    
    //Metodo abstacto que debe ser sobreescrito por las subclases
    public abstract double ingresos();
}
