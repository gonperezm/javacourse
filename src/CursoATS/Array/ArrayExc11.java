package CursoATS.Array;

import java.util.Scanner;

/*
leer 5 elementos numericos que se introducirán ordenados de forma creciente.
Estos guardemos en una tabla tamaño 10.
leer un numero N e insertarlo en el lugar adecuado para que la tabla continue ordenada.
 */
public class ArrayExc11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean creciente = true;
        int numero,sitio_num=0,j=0;




        int arreglo[] = new int[10];
        System.out.println("llenar el arreglo");
        do{

            //llenado del arreglo
            for (int i=0;i<5;i++){
                System.out.print((i+1)+"digite un num");
                arreglo[i]= entrada.nextInt();
            }

            //comprobar si el arreglo esta ordenada en forma creciente
            for (int i=0;i<4;i++) {
                if(arreglo[i]<arreglo[i+1]){  //creciente 1-2-3....
                    creciente=true;
                }
                if (arreglo[i] > arreglo[i+1]) { //decreciente 1+2+3
                    creciente = false;
                    break;
                }
            }
            if(creciente ==false){
                System.out.println("el arreglo no es ordenado en forma creciente, vuelva a intentar");
            }


        }while(creciente == false);

        System.out.println("digite un elemento a insertar: ");
        numero= entrada.nextInt();

        //Esto es para darnos cuenta en q posicion va el num
        while(arreglo[j] < numero && j<5){
            sitio_num++;
            j++;
        }

        //por ultimno transladamos una poscion en el arreglo a los elelmentos que van detras del num
        for(int i=4; i>=sitio_num; i--){
            arreglo[i+1] = arreglo[i];
        }
        //insertamos el num que el usuario puso
        arreglo[sitio_num] = numero;


        System.out.println("el arreglo queda: ");
        for (int i=0; i<6; i++){
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
