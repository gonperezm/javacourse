package NicoSalgadoCourse.HerenciaCursoNico;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word to spell it out:");
        String inputUsuario = scanner.nextLine();

        for( int i= 0; i<inputUsuario.length(); i++){
            char  caracter = inputUsuario.charAt(i);
            System.out.println(caracter);
        scanner.close();
        }
    }
}
