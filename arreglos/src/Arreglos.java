/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author erickson.vergara
 */
public class Arreglos {

    public static void main(String[] args) {
        String[] arreglo1 = new String[5];
        int[] arreglo2 = {52, 51, 46, 1, 2};

        arreglo1[0] = "uno";
        arreglo1[1] = "dos";
        arreglo1[2] = "tres";
        arreglo1[3] = "cuatro";
        arreglo1[4] = "Cinco";

        for (int i = 0; i < arreglo1.length; i++) {
            System.out.println("EL resultado es: " + arreglo1[i]);
        }

        System.out.println("\n#############################\n");

        for (int i = 0; i < arreglo2.length; i++) {
            System.out.println("EL resultado es: " + arreglo2[i]);
        }

        System.out.println("\n#############################\n");

        System.out.println(arreglo1[0]);
        System.out.println(arreglo1[1]);
        System.out.println(arreglo1[2]);
        System.out.println(arreglo1[3]);
        System.out.println(arreglo1[4]);

        System.out.println("\n#############################\n");

        System.out.println(arreglo2[0]);
        System.out.println(arreglo2[1]);
        System.out.println(arreglo2[2]);
        System.out.println(arreglo2[3]);
        System.out.println(arreglo2[4]);
    }

}
