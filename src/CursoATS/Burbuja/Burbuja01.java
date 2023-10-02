package CursoATS.Burbuja;

import java.util.Scanner;

public class Burbuja01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int nElementos, aux;
        System.out.print("que tamaño de Tabla quieres? ");
        nElementos= scanner.nextInt();

        int Tabla[]= new int[nElementos];
        for (int i = 0; i < nElementos; i++) {
            System.out.print("agrega numeros a la TABLA: ");
            Tabla[i]= scanner.nextInt();
        }

        //metodo burbuja
        for (int i = 0; i <nElementos-1; i++) {
            for (int j = 0; j < nElementos-1; j++) {
                if (Tabla[j] > Tabla[j+1]) {
                    aux = Tabla[j];
                    Tabla[j] = Tabla[j+1];
                    Tabla[j+1] = aux;
                }
            }
        }


        //imprimiendo
        System.out.println("la tabla CRECIENTE queda asi: " );
        for (int i = 0; i < nElementos; i++) {
            System.out.print(" " + Tabla[i]);
        }
        System.out.println("\nla tabla DECRECIENTE queda asi: ");
        for (int i = (nElementos-1); i>=0; i--) {
            System.out.print(" " + Tabla[i]);
        }

    }
}
