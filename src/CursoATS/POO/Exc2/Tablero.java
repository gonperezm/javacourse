package CursoATS.POO.Exc2;

public class Tablero {
    private int x;
    private int y;

    public Tablero(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moverArriba(int incremento){
        y += incremento;
    }
    public void moverAbajo( int decremento){
        y -= decremento;
    }
    public void moverIzquierda( int decremento){
        x -= decremento;
    }
    public void moverDerecha(int incremento){
        x += incremento;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void mostrarPosicion(){
        System.out.println(x+y);
    }
}
