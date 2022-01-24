
package Cuadrado;

import Punto.Punto;

public class Cuadrado {
    private Punto centro = new Punto();
    private double apotema = 0;
    
    //Constructores
    public Cuadrado(){
        
    }
    
    public Cuadrado(Punto centro, double apotema){
        this.centro = new Punto(centro);
        if(!validarApotema(apotema)){
            throw new IllegalArgumentException("El apotema no puede ser negativo");
        }
        this.apotema = apotema;
    }
    
    public Cuadrado(double x, double y, double apotema){
        this.centro = new Punto(x,y);
        if(!validarApotema(apotema)){
            throw new IllegalArgumentException("El apotema no puede ser negativo");
        }
        this.apotema = apotema;
    }
    
    public Cuadrado(Cuadrado c){
        this.centro = c.centro;
        this.apotema = c.apotema;
    }
    
    //Métodos
    public Punto getCentro() {
        return new Punto(this.centro);
    }

    public void setCentro(Punto centro) {
        this.centro = new Punto(centro);
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        if(!validarApotema(apotema)){
            throw new IllegalArgumentException("El apotema no puede ser negativo");
        }
        this.apotema = apotema;
    }

    public boolean equals(Cuadrado c) {
        return this.centro.equals(c.centro) && this.apotema == c.apotema;
    }
    
    public double getArea(){
        return Math.pow(apotema*2, 2);
    }
    
    public double getPerimetro(){
        return (apotema * 2)*3;
    }

    //Validaciones
    private boolean validarApotema(double apotema){
        return apotema > 0;
    }
    
    @Override
    public String toString() {
        return "Cuadrado{" + "centro=" + centro + ", apotema=" + apotema + '}';
    }
}
