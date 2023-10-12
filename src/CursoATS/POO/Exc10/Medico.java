package CursoATS.POO.Exc10;

public class Medico extends Persona{
    private String titulacion;
    private int añosExperiencia;

    public Medico(String nombre, String apellido, int edad, String titulacion, int añosExperiencia) {
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    @Override
    public void partidoFutbol(){
        System.out.println("Esta alerta por posible lesiones ");
    }
    @Override
    public void entrenamiento(){
        System.out.println("Da asistencia en el entrenamiento ");
    }

    public void curarLesion(){
        System.out.println("Curar lesion ");
    }




}
