
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 * 
 * Clase que muestra el analisis de una encuesta
 * 
 *  Se pidio a venite estudiantes que calificaran la calidad de la comida de la cafeteria
 * estudiantil en una escala de 1 a 5, en donde 1 significa "Pésimo" y 5 significa "Excelente".
 * Coloque las 20 respuestas en un arreglo entero y determine la frecuencia de cada calificación.
 */

/**
 *
 * @author erickson.vergara
 */
public class EncuestaEstudiantes {
    public static void main(String[] args) {
        
        //Arreglo de respuestas de estudiantes (lo mas comun es que se introducen en tiempo de ejecución)
        int [] respuestas = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
        
        //Arreglo de contadores de frecuencia
        int [] frecuencia = new int [6];
        
        //Para cada respuesta , selecciona el elemento de respuesta y esa ese valor
        //Como indice de frecuencia para determinar el elemento a incrementar
        for (int respuesta = 0; respuesta < respuestas.length; respuesta++) {
            try {
                 frecuencia[ respuestas [respuesta] ] += 1;
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Valor incorrecto: " +respuestas[respuesta]);
            }           
            
        }
        
        System.out.printf("%s %10s\n", "Calificacion", "Frecuencia");
            
            for (int calificacion = 1; calificacion < frecuencia.length; calificacion++) {
                System.out.printf("%6d %10d\n", calificacion, frecuencia[ calificacion ]);
            }
    }
}
