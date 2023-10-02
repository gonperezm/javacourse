package CursoATS.Matriz;
/*
Crear una matriz de 7x7,  y rellena de forma que
 los elementos de la diagonal principal sean 1 y el resto 0.
 */
public class MatrizExc4 {
    public static void main(String[] args) {
        int matriz [][] = new int[7][7];


        //llenamos la matriz con todos los datos en 0
        for (int i = 0; i <7; i++) {
            for (int j = 0; j < 7; j++) {
                matriz[i][j]=0;
            }
        }

        //llenamos la diagonal con 1
        for (int pos = 0; pos<7; pos++) {
           matriz [pos][pos] = 1;
        }


        //display la matriz final

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }

    }
}
