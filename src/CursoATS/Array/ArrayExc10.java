package CursoATS.Array;
/*
crea un ARRAY que sea de 10 num y
 se desplace N posiciones seugn usuario desee
 */
import java.util.Scanner;
public class ArrayExc10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("guardando el arreglo");

        int TABLA[] = new int[10];
        for(int i=0; i<10;i++){
            System.out.print("llene la tabla:");
            TABLA[i]= entrada.nextInt();
        }

        System.out.println("cuantas posiciones a desplazar?");
        int n = entrada.nextInt();

        int[] nuevoArray = new int[10];

        for (int i = 0; i < 10; i++) {
            int nuevaPosicion = (i + n) % 10; // Calcula la nueva posición
            nuevoArray[nuevaPosicion] = TABLA[i];


            // Imprimir el array desplazado
            System.out.println("Array desplazado:");
            //for (int i=0; i<10; i++){
                System.out.print(nuevoArray[i] + " ");
            }

        }
    }

