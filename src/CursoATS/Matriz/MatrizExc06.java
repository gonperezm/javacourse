package CursoATS.Matriz;
/*
ejercicio 6:
Usando 2 matrices de tamaño 5x9 y 9x5, cargar la primera y transponerla en la segunda.
 */
import java.util.Scanner;

public class MatrizExc06 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int matrizA [][]=new int [5][9];
        int matrizB [][]=new int [9][5];
        int aux;


        //ingresando los datos para la matriz A
        System.out.println("Digite los datos para la matriz A y luego sera transpuesta.");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("ingrese el dato de la matriz A ["+i+"] ["+j+"]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        //mostrando la matriz A
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matrizA[i][j]);
            }
            System.out.println("");
        }
        //transponiendo
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                matrizB [i][j] = matrizA[j][i];
            }
        }

        //imprimiendo transpuesta
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrizB[i][j]);
            }
            System.out.println("");
        }



    }
}
