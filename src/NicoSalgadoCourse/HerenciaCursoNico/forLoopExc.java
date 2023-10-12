package NicoSalgadoCourse.HerenciaCursoNico;

import java.util.Scanner;
/*suma de toda la cuenta del numero del usuario*/


public class forLoopExc {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number to be sum");
        int numUsuario = scanner.nextInt();

        int suma = 0;
        for (int i=0; i<= numUsuario; i++) {
            suma += i;
        }

            System.out.println("la sumatoria de tu num nos da " + suma);


    }
}
