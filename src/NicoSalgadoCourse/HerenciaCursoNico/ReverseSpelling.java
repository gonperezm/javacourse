package NicoSalgadoCourse.HerenciaCursoNico;

import java.util.Scanner;

public class ReverseSpelling{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame una palabra para deletrear en reversa");
        String palabra = scanner.nextLine();
        String reversa = "";
        int i = palabra.length() -1;
        while ( i >=0 ){
            reversa = reversa + palabra.charAt(i);
            i--;
        }
        System.out.println("la palabra en reversa es: " +reversa);
    }
}
