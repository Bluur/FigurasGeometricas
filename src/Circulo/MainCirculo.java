
package Circulo;

import Punto.Punto;
import Funciones.funciones;

public class MainCirculo {
    
    public static void main(String[]args){
        //Introducción
        System.out.println("¡Vamos a crear un círculo!");
        System.out.println("Primero vamos a crear el centro");
        
        //Creando el centro
        Punto centro = crearCentro();
        
        //Pidiendo el radio
        System.out.println("Introduce el radio");
        double radio = funciones.leerDouble("Dame el radio ( >0 )", 0);
        
        //Creamos el objeto
        Circulo primerCirculo = new Circulo(centro, radio);
        Circulo copia = new Circulo(primerCirculo);
        
        //Sacamos los datos por pantalla
        System.out.println(primerCirculo);
        
        //¿Área?
        String decision = funciones.leerString("¿Quieres saber el área de tu circulo?(Y/N)", "y", "n");
        if(decision.equals("y")){
            System.out.println(primerCirculo.getArea());
        }
        
        //¿Circunferencia?
        decision = funciones.leerString("¿Quieres calcular la circunferencia? (Y/N)", "y", "n");
        if(decision.equals("y")){
            System.out.println(primerCirculo.getCircunferencia());
        }
        
        //¿Cambiar parámetros?
        decision = funciones.leerString("Quieres cambiar el centro? (Y/N)", "y", "n");
        if(decision.equals("y")){
            Punto centroNuevo = crearCentro();
            primerCirculo.setCentro(centroNuevo);
        }
        decision = funciones.leerString("¿Quieres cambiar el radi? (Y/N)", "y", "n");
        if(decision.equals("y")){
            double radioNuevo = funciones.leerDouble("Dame el radio", 0);
            primerCirculo.setRadio(radioNuevo);
        }
        
        if(primerCirculo.equals(copia)){
            System.out.println("Tu circulo es igual que al principio");
        }else{
            System.out.println("Tu circulo ha cambiado");
        }
              
        //Medidas
        System.out.println("Tu circulo "+primerCirculo);
        System.out.println("Tu circulo al principio "+copia);
        
        //Área
        System.out.println("El área de tu circulo "+primerCirculo.getArea());
        System.out.println("El área de tu circulo original "+copia.getArea());
        
        //Circunferencia
        System.out.println("La circunferencia de tu circulo "+primerCirculo.getCircunferencia());
        System.out.println("La circunferencia de tu circulo original" +copia.getCircunferencia());
    }
    
    public static Punto crearCentro(){
        double x = funciones.leerDouble("Dame el punto X");
        double y = funciones.leerDouble("Dame Y");
        Punto centro = new Punto(x, y);
        return centro;
    }
}
