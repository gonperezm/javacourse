package CursoATS.Array;
/*
Read 10 number int, save it in an Array.
then, display on screen as follow:
 First, last, second, 9th, 3th, etc.
 */
import java.util.Scanner;

public class ArrayExc4 {
    public static void main(String[] args) {


        Scanner numero = new Scanner(System.in);
        int arreglo[] = new int[10];

        System.out.println("Ingrese diez numeros");

        for (int i = 0; 10 > i; i++) {
            System.out.print("Dato " + (i + 1) + ": ");
            arreglo[i] = numero.nextInt();
        }
        System.out.println("\nNuevo orden ");

        for (int i = 0; 5 > i; i++) {
            System.out.println("Dato " + (i + 1) + ": " + arreglo[i]);
            System.out.println("Dato " + (10 - i) + ": " + arreglo[9 - i]);
        }
    }
}
