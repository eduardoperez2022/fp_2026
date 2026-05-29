package eje_e452;

import java.util.Scanner;

// E452 - Crea una clase Circulo con un atributo radio. Debe tener métodos
// para calcular y devolver tanto el área (π * radio²) como el perímetro (2 * π * radio)
public class Eje_E452 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
// entrada
        System.out.println("Ingrese el radio del circulo: ");
        double elradio = sc.nextDouble();

// proceso
        circulo cir1 = new circulo();
        cir1.setRadio(elradio);
        double elarea = cir1.calcularArea();
        double elperimetro = cir1.calcularPerimetro();

// salida
        System.out.println("Area: " + elarea);
        System.out.println("Perimetro: " + elperimetro);
    }

}
