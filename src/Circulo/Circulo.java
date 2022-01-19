
package Circulo;

import Punto.Punto;
import java.lang.Math;
import java.util.Objects;

public class Circulo {
    private Punto centro = new Punto(0,0);
    private double radio;
    
    //Constructores
    public Circulo(){
       
    }
    
    public Circulo(double x, double y, double radio){
        this.centro = new Punto(x,y);
        if(!validarRadio(radio)){
            throw new IllegalArgumentException("El radio no puede ser negativo");
        }else{
            this.radio = radio;
        }
    }
    
    public Circulo(Punto centro, double radio){
        this.centro = new Punto(centro);
        if(!validarRadio(radio)){
            throw new IllegalArgumentException("El radio no puede ser negativo");
        }else{
            this.radio = radio;
        }
    }
    
    public Circulo(Circulo c){
        this.centro = new Punto(c.centro);
        if(!validarRadio(c.radio)){
            throw new IllegalArgumentException("El radio no puede ser negativo");
        }else{
            this.radio = c.radio;
        }
    }
    
    //Comprobaciones
    public final boolean validarRadio(double radio){
        return radio > 0;
    }
    
    //Métodos
    public double getArea(){
        return Math.PI * Math.pow(radio, 2);
    }
    
    public double getCircunferencia(){
        return 2 * Math.PI * radio;
    }
    
    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = new Punto(centro);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {    
        if(!validarRadio(radio)){
            throw new IllegalArgumentException("El radio no puede ser negativo");
        }else{
            this.radio = radio;
        }
    }

    public boolean equals(Circulo c) {
        
        return c.centro.getX() == this.centro.getX() && c.centro.getY() == this.centro.getY() && c.getRadio() == this.getRadio();
    }

    
    
    @Override
    public String toString() {
        return "{" + "centro = " + centro + ", radio = " + radio + '}';
    }
    
}
