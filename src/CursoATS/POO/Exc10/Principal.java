package CursoATS.POO.Exc10;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static ArrayList<Persona> persona = new ArrayList<Persona>();
    static Scanner entrada = new Scanner(System.in);

    static Persona futbolista1 = new Futbolista("Gonzalo", "Higuain", 20,9,"Delantero");
    static Persona futbolista2 = new Futbolista("Paulo","Dybala",18,10,"Delantero");
    static Persona entrenador = new Entrenador("Massimiliano", "Alegri", 35,"Defensiva");
    static Persona medico = new Medico("Alex","Marroni", 45,"Lic. Fisioterapia", 20);



    public static void main(String[] args) {
        persona.add(futbolista1);
        persona.add(futbolista2);
        persona.add(entrenador);
        persona.add(medico);

        menu();

    }

    public static void menu(){
        int opcion;
        do{
            System.out.println("\n .:MENU:.");
            System.out.println("1. Viaje de equipo");
            System.out.println("2. Entrenamiento");
            System.out.println("3. Partido de Futbol");
            System.out.println("4. Planificar entrenamiento");
            System.out.println("5. Entrevista");
            System.out.println("6. Curar lesion");
            System.out.println("7. Salir");
            System.out.print("opcion: ");
            opcion = entrada.nextInt();

            switch(opcion) {
                case 1: viajarEquipo(); // viaje de equipo
                    break;
                case 2: entrenamiento(); //Entrenamiento
                    break;
                case 3: partidoFutbol(); //Partido de futbol
                    break;
                case 4: planificarEntrenamiento(); // planificar entrenaimiento
                    break;
                case 5: entrevista(); // entrevista
                    break;
                case 6: curarLesion(); // curar lesion
                    break;
                case 7: // Salir
                    break;
                default:
                System.out.println("Error. Se equivoco de digito de opcion.");
                break;
            }
            System.out.println("");

        }while(opcion!= 7);
    }


    public static void viajarEquipo(){
        for (Persona equipo: persona) {
                  System.out.print(equipo.getNombre()+" "+ equipo.getApellido()+" --> ");
                  equipo.viajar();
              }
    }

    public static void entrenamiento(){
        for (Persona equipo: persona) {
            System.out.print(equipo.getNombre()+" "+ equipo.getApellido()+" --> ");
            equipo.entrenamiento();
        }
    }

    public static void partidoFutbol(){
        for (Persona equipo: persona) {
            System.out.print(equipo.getNombre()+" "+ equipo.getApellido()+" --> ");
            equipo.partidoFutbol();
        }
    }

    public static void  planificarEntrenamiento(){
        System.out.print(entrenador.getNombre() + " "+ entrenador.getApellido() + " --> ");
        ((Entrenador)entrenador).planificarEntrenamiento();
    }

    public static void entrevista(){
        System.out.print(futbolista1.getNombre()+" "+futbolista1.getApellido()+" --> ");
        ((Futbolista)futbolista1).entrevista();
        System.out.print(futbolista2.getNombre()+" "+futbolista2.getApellido()+" --> ");
        ((Futbolista)futbolista2).entrevista();
    }

    public static void curarLesion() {
        System.out.print(medico.getNombre() + " " + medico.getApellido() + " --> ");
        ((Medico) medico).curarLesion();
    }
}
