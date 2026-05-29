package eje_e451_v2;

public class Eje_E451_v2 {

    public static void main(String[] args) {
        
        rectangulo rec1 = new rectangulo();

        rec1.setAlto(10);
        rec1.setAncho(15);
        
        System.out.println("Area: " + rec1.calcularArea());
        
        
    }
}