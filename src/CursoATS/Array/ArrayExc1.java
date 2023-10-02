package CursoATS.Array;

import java.util.Scanner;

/*
Leer 5 números, guardarlos
en un arreglo y mostrarlos en el
 mismo orden que ingresaron.
 */
public class ArrayExc1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        float[] numeros = new float[5];

        System.out.println("guardando los datos para ARRAY");
        for(int i=0; i<5 ; i++){
            System.out.println((i+1)+ ". agrege los numeros para el ARRAY");
            numeros[i] = scanner.nextFloat();
        }
        System.out.println("imprimiendo los numeros del array");
        for (float i:numeros) {
            System.out.println(i);
        }
        
    }

}
