package CursoATS.Matriz;

import java.util.Scanner;

/*
Crear y cargar una matriz de
tamaño n x m y decir si es simétrica o no.
 */
public class MatrizExc1 {
    public static void main(String[] args) {
        int matriz[][], nFilas, nCol;
        boolean simetrica = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantas filas?");
        nFilas = scanner.nextInt();
        System.out.println("Cuantas Columnas?");
        nCol = scanner.nextInt();

        matriz =new int [nFilas][nCol];

        System.out.println("complete la matriz");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print("matriz["+i+"]["+j+"]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        if(nFilas == nCol) {
            int i, j;
            i = 0;
            while (i < nFilas && simetrica == true) {
                j = 0;
                while (j < i && simetrica == true) {
                    if (matriz[i][j] != matriz[j][i]) {
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }

            if(simetrica ==true){
                System.out.println("La matriz es simetrica!!");
            }
            else{
                System.out.println("La matriz NO es simetrica");
            }
        }


        else{
            System.out.println("La matriz no es simetrica");
        }

    }
}
