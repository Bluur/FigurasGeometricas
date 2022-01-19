
package Punto;

public class Punto {
    private double x,y;
    
    //Constructores
    public Punto(){
        this(0,0);
    }
    
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public Punto(Punto p){
        this(p.x, p.y);
    }
    
    //Métodos
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


    public boolean equals(Punto p) {
        return this.x == p.x && this.y == p.y;
    }

    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }
}
