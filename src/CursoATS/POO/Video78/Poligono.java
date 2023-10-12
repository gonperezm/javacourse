package CursoATS.POO.Video78;

public abstract class Poligono {
    protected int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }
    public int getNumeroLados() {
        return numeroLados;
    }

    @Override
    public String toString() {
        return "numero de Lados= " + numeroLados;
    }

    public abstract double area();






}
