package CursoATS.POO.Video78;

/*
Ejercicio 9: Hacer un programa para calcular el área de Polígonos
(Triángulos y Rectángulos) el programa debe ser capaz de almacenar
en un arreglo N triángulos y rectángulos, y al final mostrar el área
y los datos de cada uno. Para ello se tendrá lo siguiente:

- Una super clase llamada Polígono.
- Una sub clase llamada Rectángulo.
- Una sub clase llamada Triángulo.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        //llenar un poligono
        llenarPoligono();
        //mostrar los datos y el area de cada poligono
        mostrarResultado();
    }


    public static void llenarPoligono(){
        char respuesta;
        int opcion;
        do{
            do{
                System.out.println("Digite que poligono desea");
                System.out.println("1. Triangulo");
                System.out.println("2. Rectangulo");
                System.out.print("Opcion: ");
                opcion = entrada.nextInt();
            }while(opcion<1 || opcion>2);

            switch (opcion){
                case 1: llenarTriangulo(); //lenar un triangulo

                    break;
                case 2: llenarRectangulo(); //llenar un rectangulo
                    break;
            }
            System.out.print("desea introducion otro poligono(s/n): ");
            respuesta = entrada.next().charAt(0);
            System.out.println("");
        }while( respuesta =='s'||respuesta=='S');
    }

    public static void llenarTriangulo(){
        double lado1,lado2,lado3;

        System.out.print("Digite el lado1 del triagulo: ");
        lado1= entrada.nextDouble();
        System.out.print("Digite el lado2 del triagulo: ");
        lado2= entrada.nextDouble();
        System.out.print("Digite el lado3 del triagulo: ");
        lado3= entrada.nextDouble();

        Triangulo triangulo = new Triangulo(lado1,lado2,lado3);
        //guardamos un triangulo dentro del array de poligonos
        poligono.add(triangulo);


    }

    public static void llenarRectangulo(){
        double lado1,lado2;

        System.out.print("Digite el lado1 del Rectangulo: ");
        lado1= entrada.nextDouble();
        System.out.print("Digite el lado2 del Rectangulo: ");
        lado2= entrada.nextDouble();

        Rectangulo rectangulo = new Rectangulo(lado1,lado2);
        //guardamos un rectangulo dentro del array de poligonos
        poligono.add(rectangulo);


    }

    public static void mostrarResultado(){
        //recorriendo el arreglo de poligono
        for(Poligono poli:poligono){
            System.out.println(poli.toString());
            System.out.println("Area = " + poli.area());
            System.out.println("");
        }

    }

}
