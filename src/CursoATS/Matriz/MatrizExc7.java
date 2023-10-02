package CursoATS.Matriz;
/*
Crear una matriz “marco” de tamaño 5x5:
 todos sus elementos deben ser 0 salvo los de los bordes que deben ser 1.
 Mostrarla.
 */
public class MatrizExc7 {
    public static void main(String[] args) {
       int filas = 5;
       int columnas = 5;
       int matriz [][] = new int [filas][columnas];
        //por defecto estará en 0 todos los datos
       //armando el marco con 1
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if( i==0|| i == filas -1 ||j==0||j== columnas -1 ){
                    matriz  [i][j]= 1;
                }
            }
        }

        //imprimiendo
        System.out.println("la matriz con marcos en 1 se ve asi: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }




    }
}
