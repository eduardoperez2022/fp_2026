package eje_e304;

import java.util.Scanner;

public class Eje_E304 {

// E304- Escribir un programa que pida al usuario un número entero positivo
// y muestre por pantalla la cuenta atrás desde ese número hasta cero
// separados por comas
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

// entrada
        System.out.println("Ingrese un numero positivo :");

        int numpos = sc.nextInt();

// proceso y salida
        for (int i = numpos; i >= 0; i--) {
            if (i == 0) {
                System.out.print(i);
            } else {
                System.out.print(i + ", ");
            }
        }
        System.out.println("");
    }
}
