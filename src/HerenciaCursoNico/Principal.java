package HerenciaCursoNico;
/*
Crea una clase llamada "Persona" con atributos como
'nombre', 'edad', y 'dirección'. Después,
crea una clase llamada "Estudiante" que herede
los atributos de "Persona", y añada atributos como
'idDeEstudiante' y 'calificación'. Imprime todos los datos
de la clase 'Estudiante' en la consola.
 */
public class Principal {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        System.out.println((estudiante.nombre = "gon"));
        System.out.println((estudiante.direccion = "aguirre"));
        System.out.println((estudiante.edad = 19));
        System.out.println((estudiante.calificacion = 'A'));
        System.out.println((estudiante.idDeEstudiante = 01));




        Empleado empleado = new Empleado();
        System.out.println(empleado.idEmpleado = 03);
        System.out.println(empleado.nombre = "Ggggg");
        System.out.println(empleado.salario = 12.55);

    }
}
