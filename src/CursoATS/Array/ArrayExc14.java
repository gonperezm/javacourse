package CursoATS.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExc14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] TablaA =new int[10];
        int[] TablaB =new int[10];


        System.out.println("llenado los ARRAY");
        for (int i = 0; i <10; i++) {
            System.out.print("llena el array 1 con un numero: ");
            TablaA[i]=scanner.nextInt();
        }
        for (int i = 0; i <10; i++) {
            System.out.print("llena el array 2 con un numero: ");
            TablaB[i]=scanner.nextInt();
        }

        int longitudTotal = TablaA.length + TablaB.length;
        int[] TablaC = new int[longitudTotal];

        for (int i = 0; i <TablaA.length; i++) {
            TablaC[i] = TablaA[i];
        }
        for (int i = 0; i <TablaB.length; i++) {
            TablaC[TablaA.length + i ] = TablaB[i];
        }

        Arrays.sort(TablaC);

        System.out.print("el nuevo array conjunto es: ");
        for (int i = 0; i < TablaC.length; i++) {
            System.out.print(TablaC[i] + " - ");
        }
    }
}

/*
si no queres el ULTIMO GUION DE LA RESPUESTA
System.out.print("el nuevo array conjunto es: ");
for (int i = 0; i < TablaC.length - 1; i++) {
    System.out.print(TablaC[i] + " - ");
}
// Imprimir el último elemento sin el guion
System.out.print(TablaC[TablaC.length - 1]);
 */