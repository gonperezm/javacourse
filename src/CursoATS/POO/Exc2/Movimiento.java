package CursoATS.POO.Exc2;

import java.util.Scanner;

public class Movimiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        int opcion;
        int incremento = 0;

        System.out.print("Digite la posicion inicial de X: ");
        x=scanner.nextInt();
        System.out.print("Digite la posicion inicial de Y: ");
        y=scanner.nextInt();

        Tablero tablero = new Tablero(x, y);
        do{
            System.out.println("\n\t MENU");
            System.out.println("1. Mover hacia arriba");
            System.out.println("2. Mover a la derecha");
            System.out.println("3. Mover hacia abajo");
            System.out.println("4. Mover a la izquierda");
            System.out.println("5. SALIR");
            System.out.println("Digite una opcion: ");
            opcion = scanner.nextInt();

            if ( opcion !=5){
                System.out.println("digite el incremento o decremento de una coordenada");
                incremento = scanner.nextInt();
            }

            switch(opcion){
                case 1:
                    tablero.moverArriba(incremento);
                    break;
                case 2:
                    tablero.moverDerecha(incremento);
                    break;
                case 3:
                    tablero.moverAbajo(incremento);
                    break;
                case 4:
                    tablero.moverIzquierda(incremento);
                    break;
                case 5:
                    System.out.println("posicion actual de (X) (Y) es : " + (tablero.getX() +" - "+ tablero.getY()));
                    opcion =5;
                    break;
                default:
                    System.out.println("la opcion no existe, vuelva a intentar");
                    break;
            }
            System.out.println("posicion actual de (X) (Y) es : " + (tablero.getX() +" - "+ tablero.getY()));



        }while(opcion != 5);




    }
}
