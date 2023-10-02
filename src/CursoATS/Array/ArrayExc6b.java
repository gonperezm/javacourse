package CursoATS.Array;

import java.util.Scanner;

/*
Leer los datos correspondientes a dos tablas de
12 elementos numericos, y mezclarlos en una tercera
de la formar
3 de la tabla A, 3 de la B, 3 de la A, 3 de la B, ETC.
 */
public class ArrayExc6b {
    public static void main(String[] args) {

        int a[], b[], c[];
        a = new int[12];
        b = new int[12];
        c = new int[24];

        Scanner Scanner = new Scanner(System.in);
        System.out.println("guardando los datos de las tablas");

        //Array A
        for(int i=0; i<12; i++){
            System.out.println("Para TABLA A Digite el dato #"+(i+1)+" para ser almacenado: ");
            a[i] = Scanner.nextInt();
        }

        //Array B
        for(int i=0; i<12; i++){
            System.out.println("Para TABLA B Digite el dato #"+(i+1)+" para ser almacenado: ");
            b[i]= Scanner.nextInt();
        }

        //Array C
        int j=0;
        for (int i=0; i<4; i++){
            c[j]= a[i];
            j++;
            c[j]= a[i+1];
            j++;
            c[j]= a[i+2];
            j++;
            c[j]= b[i];
            j++;
            c[j]= b[i+1];
            j++;
            c[j]= b[i+2];
            j++;
        }

        System.out.println("El array 3-C queda asi de 3 en 3:\n");
        for (int i=0; i<24; i++) {
            System.out.print( c[i] + "-" );
        }

    }
}
