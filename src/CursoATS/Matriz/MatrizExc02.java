package CursoATS.Matriz;

import java.util.Scanner;

public class MatrizExc02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matriz01[][] = new int [3][3];
        int matriz02[][] = new int [3][3];
        int matrizResultado[][] = new int [3][3];

        System.out.println("Ingrese los valores para la primera matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("matriz01["+i+"]["+j+"]: ");
                matriz01[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ingrese los valores para la Segunda matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("matriz02["+i+"]["+j+"]: ");
                matriz02[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizResultado[i][j] = matriz01 [i][j] + matriz02 [i][j];
            }
        }


        System.out.println("la matriz Resultado es: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizResultado[i][j]);
            }
            System.out.println("");
        }
    }
}
