package CursoATS.POO.Exc4;

public class atleta {
    private int numeroAtleta;
    private String nombre;
    private float tiempoCarrera;

    public atleta(int numeroAtleta, String nombre, float tiempoCarrera) {
        this.numeroAtleta = numeroAtleta;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }


    public float getTiempoCarrera() {
        return tiempoCarrera;
    }

    public String mostrarDatosGanador(){
        return "Numero de Atleta: "+numeroAtleta+"\nNombre del Atleta: "+nombre+"\nTiempo de Carrera: "+tiempoCarrera+"\n";
    }



}
