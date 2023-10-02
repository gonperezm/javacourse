package CursoATS.POO.Exc4;

import java.util.Scanner;

public class principal {
    public static int indiceGanador(atleta atleta[]){
        float tiempoCarrera;
        int indice =0;
        tiempoCarrera = atleta[indice].getTiempoCarrera();
        for (int i = 1; i < atleta.length; i++) {
            if (atleta[i].getTiempoCarrera() < tiempoCarrera){
                tiempoCarrera = atleta[i].getTiempoCarrera();
                indice=i;
            }
        }
        return indice;
    }



    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int numeroAtleta, nAtletas, indiceAtletaGanador;
        float tiempoCarrera;


        System.out.println("Digite el numero de Atletas a participar: ");
        nAtletas = entrada.nextInt();

        //creamos los objetos para cada atleta
        atleta atleta[] = new atleta[nAtletas];
        for (int i = 0; i < atleta.length; i++) {
            System.out.println("\n Digite los datos del Atleta " +(1+i)+" : ");
            System.out.println("Introduzca el numero de Atleta: ");
            numeroAtleta= entrada.nextInt();
            entrada.nextLine();
            System.out.println("Introduzca el nombre del Atleta: ");
            nombre= entrada.nextLine();
            System.out.println("Introduzca el tiempo del Atleta: ");
            tiempoCarrera= entrada.nextFloat();

            atleta[i]= new atleta(numeroAtleta,nombre,tiempoCarrera);
        }

        indiceAtletaGanador=indiceGanador(atleta);
        System.out.println("\n El Atleta ganador es: ");
        System.out.println(atleta[indiceAtletaGanador].mostrarDatosGanador());
    }
}
