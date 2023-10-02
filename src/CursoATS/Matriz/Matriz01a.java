package CursoATS.Matriz;

import java.util.Scanner;

public class Matriz01a {
    public static void main(String[] args) {
        int matriz [][], nFilas, nCol;

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la cantidad de Filas");
        nFilas = scanner.nextInt();
        System.out.println("ingrese la cantidad de Columnas");
        nCol = scanner.nextInt();

        matriz = new int[nFilas][nCol];

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j <nCol ; j++) {
                System.out.print("Digite la matriz ["+i+"] ["+j+"]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nla matriz es: ");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }



    }
}
