package CursoATS.Matriz;

import java.util.Scanner;

public class MatrizExc05 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int matriz[][], nFilas, nCol;

        //pidiendo filas y columnas
        System.out.println("Cuantas Filas?");
        nFilas= scanner.nextInt();
        System.out.println("Cuantas Columnas?");
        nCol= scanner.nextInt();

        matriz = new int[nFilas][nCol];


        //ingresando la matriz por usuario
        System.out.println("Digite la matriz");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print("matriz ["+i+"]["+j+"]: ");
                matriz [i][j] = scanner.nextInt();
            }
        }

        //imprimiendo la matriz ingredada
        System.out.println("la matriz cargada queda asi: " );
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print(matriz [i][j] +" ");
            }
            System.out.println("");
        }


        // sumar las fila
        int sumaFilas;
        for (int i = 0; i < nFilas; i++) {
            sumaFilas = 0;
            for (int j = 0; j < nCol; j++) {
                sumaFilas +=matriz[i][j];
            }
            System.out.println("la suma de la Fila ["+i+"] es: " + sumaFilas);
        }
        System.out.println("");


        //sumar columnas
        int sumaColumnas;
        for (int j = 0; j < nCol; j++) {
            sumaColumnas = 0;
            for (int i = 0; i < nFilas; i++) {
                sumaColumnas +=matriz[i][j];
            }
            System.out.println("la suma de la Columna ["+j+"] es: " + sumaColumnas);
        }
        System.out.println("");

    }
}
