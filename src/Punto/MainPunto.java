package Punto;

import Funciones.funciones;

public class MainPunto {
    
    public static void main(String[] args) {
        //Creamos un objeto punto en las coordenadas x = 2 e y = 3
        Punto primerPunto = new Punto(2,3);
        
        //Creamos otro objeto Punto copia del original
        Punto copia = new Punto(primerPunto);
        
        //Cambiamos los valores de la copia
        copia.setX(5);
        copia.setY(8);
        
        //Sacamos los valores de ambos por consola para comprobar que estan correctamente
        System.out.println("El primer punto tiene las coordenadas siguientes: ");
        System.out.println(primerPunto);
        System.out.println("El segundo punto tiene las coordenadas siguientes");
        System.out.println(copia);
        
        //Comparamos ambos objetos para ver si contienen el mismo contenido
        if(primerPunto.equals(copia)){
            System.out.println("Los dos puntos son iguales");
        }else{
            System.out.println("Los dos puntos son distintos");
        }
        
        //Cambiar alguno de los dos puntos
        if(cambiarDatos("¿Quieres cambiar los datos de la primerPunto? (Y/N)")){
            primerPunto.setX(funciones.leerDouble("Dame X"));
            primerPunto.setY(funciones.leerDouble("Dame Y"));
        }
        System.out.println(primerPunto);
        
        //Comparamos después de cambiar los datos
        if(cambiarDatos("¿Quieres cambiar los datos de la copia? (Y/N)")){
            copia.setX(funciones.leerDouble("Dame X"));
            copia.setY(funciones.leerDouble("Dame Y"));
        }
        System.out.println(copia);
        
        if(primerPunto.equals(copia)){
            System.out.println("Los dos puntos son iguales");
        }else{
            System.out.println("Los dos puntos son distintos");
        }
    }
    private static boolean cambiarDatos(String mensaje){
        String cambiar = funciones.leerString(mensaje, "y", "n");
        return cambiar.equals("y");
    }

}
