package CursoATS.Array;

import java.util.Scanner;

/*
Diseña un app que declare una tabla de 10 elementos enteros.
leer mediante el teclado 8 numeros.
despues se debe pedir un numero y una posicion,
insertarlo en la posicion indicada, desplazando los que esten detras
 */
public class ArrayExc8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int a[] = new int[10];
        int numero, posicion;

// Introduciendo los primeros 8 elementos del arreglo.
        for (int i = 0; i < 8; i++) {
            System.out.print((i + 1) + ". Digite un número: ");
            a[i] = entrada.nextInt();
        }

// Ingresar 2 número en posiciones determinadas por el usuario.
        for (int i = 0; i < 2; i++) {


            System.out.print("\nDigite un número para ingresar: ");
            numero = entrada.nextInt();

            System.out.print("\n" +
                    "Digite una posición entre 1-10 del arreglo"
                    + "\ndonde quiere ingresar el número: ");
            posicion = entrada.nextInt();


            int cont = 9;
            for (int j = cont; j >= posicion; j--) {
                a[j] = a[j - 1];
            }
            a[posicion-1] = numero;

        }

// Imprimiendo el arreglo.
        System.out.print("El arreglo es: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }


    }
}
