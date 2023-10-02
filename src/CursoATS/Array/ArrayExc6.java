package CursoATS.Array;


/*
 * Ejercicio 6:
 * Leer los datos  correspondientes a dos tablas de 12 elementos numericos,
 y mezclarlos en una tercera de la forma:
 *  3 de la tabla A, 3 de la B, otros 3 de la A, etc.
 */


import java.util.Scanner;

public class ArrayExc6 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int [] a = {1,2,3,4,5,6,7,8,9,10,11,12};
        int [] b = {13,14,15,16,17,18,19,20,21,22,23,24};
        int [] c = new int [24];

        int j=0;
        //contador j nos va a ayudar a acceder a cada dato del arreglo "c".
        for(int i=0; i<12; i+=3){
            //agregando datos desde a
            c[j] = a[i];
            j++;
            c[j] = a[i+1];
            j++;
            c[j] = a[i+2];
            j++;
            //agregando datos desde b
            c[j] = b[i];
            j++;
            c[j] = b[i+1];
            j++;
            c[j] = b[i+2];
            j++;
        }
        System.out.print("Los numeros mezclados son: \n");
        for(int i=0; i<24; i++){
            System.out.print(c[i] + " ");
        }

    }
}
