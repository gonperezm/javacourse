package NicoSalgadoCourse.HerenciaCursoNico;

public class Metodos {

    void suma(int numero1, int numero2){
        int suma = numero1 + numero2;
        System.out.println(suma);
    }

    void resta(int numeroA, int numeroB){
        int resta = numeroA - numeroB;
        System.out.println(resta);
    }

    void multiply(int num1, int num2){
        int multiply = num1*num2;
        System.out.println(multiply);
    }
    void MasGrande(int number1,int number2){
        if(number1>number2){
            System.out.println(number1);
        } else if (number2>number1) {
            System.out.println(number2);
        }
        else{
            System.out.println("son iguales");
        }
    }



    public static void main(String[] args){
        Metodos metodos = new Metodos();
        metodos.suma(1,32);
        metodos.resta(50,20);
        metodos.multiply(432,555);
        metodos.MasGrande(355,355);
    }
}
