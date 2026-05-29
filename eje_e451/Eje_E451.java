package eje_e451;

// E451 -  Diseña una clase Rectangulo con los atributos ancho y alto. Añade 
// un método calcularArea() que devuelva el área del rectángulo

public class Eje_E451 {

    public static void main(String[] args) {
        
        rectangulo rec1 = new rectangulo();
        rec1.alto = 10;
        rec1.ancho = 15;
        
        System.out.println("Area: " + rec1.calcularArea());
        
    }
    
}