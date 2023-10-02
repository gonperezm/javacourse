package CursoATS.insercion;

import javax.swing.*;
import java.util.Scanner;

public class insercion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nElementos,pos, aux;
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("que tamaño de Tabla quieres?"));

        int Tabla[] = new int[nElementos];
        for (int i = 0; i < nElementos; i++) {
            System.out.print("agrega numeros a la TABLA: ");
            Tabla[i] = scanner.nextInt();
        }

        //metodo insercion
        for (int i = 0; i < nElementos; i++) {
            pos = i;
            aux = Tabla[i];

            while ((pos > 0) && (Tabla[pos - 1] > aux)) {
                Tabla[pos] = Tabla[pos - 1];
                pos--;
            }
            Tabla[pos] = aux;

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