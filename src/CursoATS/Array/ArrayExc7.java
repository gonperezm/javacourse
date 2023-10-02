package CursoATS.Array;

import java.util.Scanner;

/*
Leer por teclado una serie de 10 num enteros.
la app debe indicarnos si los numeros estan ordenados de forma
creciente, decrecietne o desordenados.
 */
public class ArrayExc7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int TablaA[] = new int[10];
        boolean creciente=false, decreciente=false;



        System.out.println("llene la tabla");
        for (int i=0; i<10; i++){
            System.out.print("agrega un numero: ");
            TablaA[i]= scanner.nextInt();
        }

        for ( int i=0; i<9;i++){
            if(TablaA[i] < TablaA[i+1]){ //comprobante creciente 1-2-3-4-5....
                creciente=true;
            }
            if(TablaA[i] > TablaA[i+1]){ //comprobante decreciente 5-4-3-2-1....
                decreciente=true;
            }
        }

        if(creciente == true && decreciente == false){
            System.out.println("La tabla es CRECIENTE");
        } else if (creciente == false && decreciente == true) {
            System.out.println("La tabla es DECRECIENTE");
        } else if (creciente == true && decreciente == true) {
            System.out.println("La tabla es DESORDENADO");
        } else if (creciente == false && decreciente == false) {
            System.out.println("La tabla es SON IGUALES LOS NUM");
        }
    }
}
