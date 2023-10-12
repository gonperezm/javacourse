package NicoSalgadoCourse.HerenciaCursoNico;

import java.util.Scanner;

public class ContraExc {

    public static void main(String[] args) {
        System.out.println("dame una contraseña");
        Scanner scanner = new Scanner(System.in);
        String contrasena = scanner.nextLine();
        System.out.println("pone tu contra");
        String verificador = scanner.nextLine();

        while(!contrasena.equals(verificador)) {
            System.out.println("equivocado, proba again");
            verificador = scanner.nextLine();
        }
        System.out.println("es igual la contra ");
    }
}
