package CursoATS.Array;

import java.util.Scanner;

/*
Leer 5 números por teclado, almacenarlos
en un arreglo y a continuación realizar
la media de los números positivos,
 la media de los negativos y conteo el número de ceros.
 */
public class ArrayExc2 {
    public static void main(String[] args) {
    float numeros [] = new float[5];
    Scanner entrada = new Scanner(System.in);
    float suma_positivos=0, suma_negativos=0, media_positivos, media_negativos;
    int conteo_positivos=0, conteo_negativos=0, conteo_ceros=0;


        System.out.println("guardando los num en el ARRAY");
        for (int i=0;i<5;i++){
            System.out.println((i+1) + "Digite un numero:");
            numeros[i] = entrada.nextFloat();

            if(numeros[i] == 0){
                conteo_ceros++;
            }
            else if(numeros[i] > 0){
                suma_positivos += numeros[i];
                conteo_positivos++;
            }
            else {
                suma_negativos += numeros[i];
                conteo_negativos++;
            }
        }

        //promedio de los num positivos

        if (conteo_positivos == 0){
            System.out.println("no se puede sacar la medio de los num positivos");
        }
        else{
            media_positivos= suma_positivos/conteo_positivos;
            System.out.println("la media de los num positivos es " + media_positivos);
        }

        //media de los num negativos

        if (conteo_negativos == 0){
            System.out.println("no se puede sacar la media de los num negativos");
        }
        else{
            media_negativos = suma_negativos/conteo_negativos;
            System.out.println("la media de los num negativo es " + media_negativos);
        }

        System.out.println("la cantidad de ceros es " + conteo_ceros);
    }

}
