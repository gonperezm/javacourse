package NicoSalgadoCourse.HerenciaCursoNico;

import java.util.Scanner;

public class whileLoopExc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("dame una palabra y te digo cuantas letras tiene");
        String input = scanner.nextLine();

        int contador = 0;
        int i = 0;
        while (i< input.length()) {
            if(Character.isLetter(input.charAt(i))){
                contador++;
            }
            i++;
        }
        System.out.println("la cantidad de letras son : " + contador);
    }
}
