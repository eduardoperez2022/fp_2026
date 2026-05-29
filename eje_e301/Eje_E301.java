package eje_e301;

import java.util.Scanner;

public class Eje_E301 {

// E301- Escribir un programa que pida al usuario una palabra y la muestre
// por pantalla 10 veces
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

// entrada
        System.out.println("Ingrese una palabra :");

        String palabra = sc.nextLine();

// proceso y salida
        for (int i = 0; i < 10; i++) {
            System.out.println(palabra);
        }

    }

}
