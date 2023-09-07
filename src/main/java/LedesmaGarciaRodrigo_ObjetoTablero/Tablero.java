package LedesmaGarciaRodrigo_ObjetoTablero;

public class Tablero {
    private double x;
    private double y;

    public Tablero() {
    }

    public Tablero(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void moverArriba(double incremento){
        y += incremento;
    }

    public  void moverAbajo(double incremento){
        y -= incremento;
    }

    public void moderDerecha(double incremento){
        x += incremento;
    }

    public void moderIzquierda(double incremento){
        y -= incremento;
    }

}
