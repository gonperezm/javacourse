package CursoATS.Array;

import java.util.Scanner;

public class ArrayExc13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a[] = new int[10];
        int conteo_pares = 0, conteo_impares = 0;

        System.out.println("llenando el arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.print("agrege un num: ");
            a[i] = scanner.nextInt();

            if (a[i] % 2 == 0) {
                conteo_pares++;
            }
            else {
                conteo_impares++;
            }
        }


        int par[] = new int[conteo_pares]; //creamos el arreglo para almacenar los pares
        int impar[] = new int[conteo_impares]; //y ahora los num impares

        conteo_pares = 0;
        conteo_impares = 0;


        //almacenamos los numeros pares en su arreglo y los impares tmb
        for (int i = 0; i < 10; i++) {
            if (a[i] % 2 == 0) {
                par[conteo_pares] = a[i];
                conteo_pares++;
            } else { // si el numero es impar
                impar[conteo_impares] = a[i];
                conteo_impares++;
            }
        }
        System.out.print("arreglo pares: ");
        for (int i = 0; i < conteo_pares; i++) {
            System.out.print(par[i] + " ");

        System.out.println(" ");

        System.out.print("arreglo impares: ");
        //for (int i = 0;i< conteo_impares;i++) {
            System.out.print(impar[i] + " ");
            }
        }


}
