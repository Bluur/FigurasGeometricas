
package Cuadrado;

import Punto.Punto;

public class MainCuadrado {

    public static void main(String[] args) {
        Punto centro = new Punto(0,0);
        Cuadrado cuadraditoPrueba = new Cuadrado(centro, 2);
        
        System.out.println(cuadraditoPrueba);
        System.out.println(cuadraditoPrueba.getArea());
        System.out.println(cuadraditoPrueba.getPerimetro());
    }
    
}
