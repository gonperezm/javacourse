package NicoSalgadoCourse.HerenciaCursoNico;

import java.time.LocalDate;
import java.util.Scanner;

public class Date {

    public static void main(String[] args) {

        LocalDate fecha = LocalDate.now();
        System.out.println(fecha);


        Scanner input = new Scanner(System.in);
        System.out.println("tu nombre?");
        String nombreUsuario = input.nextLine();
        System.out.println("tu nombre es " + nombreUsuario);


    }
}
