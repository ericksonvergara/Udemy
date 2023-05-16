/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erickson.vergara
 */
public class OperacionesStrings {
    public static void main(String[] args) {
        String cadena1 = "Hola";
        String cadena2 = "Dev!";
        int enteroAUnir = 20;
        
        //Concatenar
        String mensaje = cadena1 + " " + cadena2;
        System.out.println(mensaje);
        
        String textoConNumero = cadena1 + enteroAUnir;
        System.out.println(textoConNumero);
        System.out.println(cadena1 + (enteroAUnir + 40));
        
        //Concatenación con CONCAT
        String pruebaConcat = "to".concat("get").concat("her").concat(" with").concat(" them");
        System.out.println(pruebaConcat);
        
        int cantidadDeCaracteres = "Erickson Vergara Rojas".length();
        System.out.println("La cantidad de caracteres de mi nombre es: " + cantidadDeCaracteres);
        
        String lenguajeFavorito = "Mi lenguaje favorito es Java";
        String extraccion = lenguajeFavorito.substring(24, 28);
        System.out.println("La extracción es: "+ extraccion);       
        
        String saludo1 = "Hola Dev!";
        String saludo2 = "Hola Erickson";
        boolean esIgual = saludo1.equals(saludo2);
        System.out.println("Son iguales la cadenas? " + esIgual);
        
        String saludo3 = "Hola Dev!";
        String saludo4 = "Hola Dev!";
        boolean siEsIgual = saludo3.equals(saludo4);
        System.out.println("Son iguales la cadenas? " + siEsIgual);
        
        String saludo5 = "Hola Dev!";
        String saludo6 = "HOLA DEV!";
        boolean sonIgualesConMayusculas = saludo5.equals(saludo6);
        System.out.println("Son iguales la cadenas aunque una esta en mayusculas? " + sonIgualesConMayusculas);
        
        String saludo7 = "Hola Dev!";
        String saludo8 = "HOLA DEV!";
        boolean sonIgualesConMayus = saludo7.equalsIgnoreCase(saludo8);
        System.out.println("Son iguales la cadenas ignoranod las mayusculas? " + sonIgualesConMayus);
        
        //Metodo indexOf
        String pais = "Argentina";
        int indice = pais.indexOf("e");
        System.out.println("El indice de la letra 'e' en la palabra " + pais + " es: " + indice);
        
        String opinion = "Uno de los paises mas bonitos es Japón. Japón tiene muchas cosa para ver";
        int indiceJapon = opinion.indexOf("Japón");
        System.out.println("La palabra Japón esta en el indice: " + indiceJapon);
        
        char letraExtraida = "Argentina".charAt(3);
        System.out.println("La letra contenida dentro del indice 3 es: " + letraExtraida);
             
    }
}
