package CursoATS.Array;
/*
Leer por teclado dos tablas de 10
números enteros y mezclarlas en una
tercera de la forma:
el 1º de A, el 1ºde B,
el 2º de A, el 2º de B, etc.
 */
import java.util.Scanner;

public class ArrayExc5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a[], b[], c[];
        a = new int[10];
        b = new int[10];
        c = new int[20];

        //Array A
        for(int i=0; i<10; i++) {
            System.out.println((i + 1) +"Ingrese un numero para la tabla A: ");
            a[i] = scanner.nextInt();
        }
        //Array B
        for(int i=0; i<10; i++) {
            System.out.println((i + 1) +"Ingrese un numero para la tabla B: ");
            b[i] = scanner.nextInt();
        }
        //array c
        // vamos a usar i para a y b
        // j para el C
        int j=0;
        for (int i=0; i<10; i++) {
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;

        }

        System.out.println("El tercer ARRAY es:");
        for (int i=0; i<20; i++){
            System.out.print(c[i] + " ");

            System.out.print("");

        }
    }

}
