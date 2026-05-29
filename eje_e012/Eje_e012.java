package eje_e012;

import java.util.Scanner;

public class Eje_e012 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

// entrada
        System.out.println("Ingrese tres lados:");

        int lado1 = sc.nextInt();
        int lado2 = sc.nextInt();
        int lado3 = sc.nextInt();

// proceso
        String tipo = "";
        if ((lado1 == lado2) && (lado1 == lado3)) {
            tipo = "equilatero";
        } else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
            tipo = "isosceles";
        } else {
            tipo = "escaleno";
        }

// salida
        System.out.println("Tipo: " + tipo);

    }

}
