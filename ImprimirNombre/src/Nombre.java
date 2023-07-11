/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erickson.vergara
 */
public class Nombre {

    public static void main(String[] args) {
        String nombre1 = "ERICK";
        int altura = 5; // Altura de las letras

        // Definir los patrones de cada letra
        String[] letras = {
            // Patrón de la letra E
            "*****\n"
            + "*    \n"
            + "*****\n"
            + "*    \n"
            + "*****\n",
            // Patrón de la letra R
            "*****\n"
            + "*    \n"
            + "*****\n"
            + "* *  \n"
            + "*  *\n",
            // Patrón de la letra I
            "*****\n"
            + "  *  \n"
            + "  *  \n"
            + "  *  \n"
            + "*****\n",
            // Patrón de la letra C
            " *****\n"
            + "*     \n"
            + "*     \n"
            + "*     \n"
            + " *****\n",
            // Patrón de la letra K
            "*   *\n"
            + "*  * \n"
            + "***  \n"
            + "*  * \n"
            + "*   *\n"
        };

        // Imprimir el nombre ERICK utilizando asteriscos
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < nombre1.length(); j++) {
                char letra = nombre1.charAt(j);
                int indiceLetra = letra - 'A'; // Obtener el índice correspondiente a la letra
                System.out.print(letras[indiceLetra].split("\n")[i]);
                System.out.print("   "); // Espacio entre letras
            }
            System.out.println();
        }
    }
}
