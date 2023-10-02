package CursoATS.Array;

import java.util.Scanner;

/*
crea un array que lea 10 num
que el primero pase a segundo y asi. el ultimo sera el primero
 */
public class ArrayExc9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int TablaA [] = new int[10]; // creamos el array de 10

        int ultimo;
        System.out.println("llenar el arreglo");
        for (int i=0; i<10;i++){
            System.out.print("digite un num: ");
            TablaA[i] = scanner.nextInt();
        }

        ultimo = TablaA[9]; //guardamos el ultimo elemento


        for (int i=8; i>=0 ; i--){ //avanzamos 1 posicion en la tabla
            TablaA[i+1] = TablaA[i];
        }
        TablaA[0] = ultimo; //ponemos el ultimo elemento como primero

        System.out.println("el nuevo ARRAY es:");
        for(int i=0; i<10; i++){
            System.out.println(i + " numero: "+ TablaA[i]);
        }
    }
}
