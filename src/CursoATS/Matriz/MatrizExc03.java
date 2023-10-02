package CursoATS.Matriz;

import java.util.Scanner;

public class MatrizExc03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int matriz [][]= new int [3][3];


        System.out.println("Digite la matriz: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("la matriz original es: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        //transponer la matriz
        int aux;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i]= aux;
            }
        }

        System.out.println("la matriz Transpuesta es: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }


    }
}
