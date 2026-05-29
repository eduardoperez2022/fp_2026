package eje_e302;

import java.util.Scanner;

public class Eje_E302 {

// E302- Escribir un programa que pregunte al usuario su edad y muestre por
// pantalla todos los años que ha cumplido (desde 1 hasta su edad)
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

// entrada
        System.out.println("Ingrese su edad :");

        int edad = sc.nextInt();

// proceso y salida
        for (int i = 1; i <= edad; i++) {
            System.out.println(i);
// System.out.print(i + " ");
        }

    }

}
