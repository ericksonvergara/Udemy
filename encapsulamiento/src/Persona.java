
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erickson.vergara
 */
public class Persona {
    
    private String nombre;
    private String nacionalidad;
    private double altura;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura > 3){
            JOptionPane.showMessageDialog(null, "Altura Invalida!");
        }else{
        this.altura = altura;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad < 0 || edad > 120){
            JOptionPane.showMessageDialog(null, "Edad Invalida!");
        }else{
        this.edad = edad;
        }
    }   
}
