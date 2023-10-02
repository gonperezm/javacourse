package CursoATS.POO.POOExc3;

import java.util.Scanner;

public class principal {

    public static int indiceCocheMBarato(vehiculo coches[]){
        float  precio;
        int indice=0;

        precio = coches[0].getPrecio();
        for (int i = 0; i < coches.length; i++) {
            if (coches[i].getPrecio() < precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String marca,modelo;
        float precio;
        int numeroVehiculos, indiceBarato;


        System.out.println("Digite la cantidad de vehiculos: ");
        numeroVehiculos = scanner.nextInt();

        //creamos los obj para los coches
        vehiculo coches[]= new vehiculo[numeroVehiculos];

        for (int i = 0; i < coches.length; i++) {
            scanner.nextLine();
            System.out.println("\n Digite las caracteristicas del coche " + (i+1) + ": ");
            System.out.println("Introduzca Marca: ");
            marca= scanner.nextLine();
            System.out.println("Introduzca Modelo: ");
            modelo  = scanner.nextLine();
            System.out.println("Introduzca Percio: ");
            precio = scanner.nextFloat();

            coches[i] = new vehiculo(marca,modelo,precio);
        }

        indiceBarato = indiceCocheMBarato(coches);
        System.out.println("el coche mas barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());
    }
}
