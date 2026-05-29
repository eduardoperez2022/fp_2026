package eje_305;

import java.util.Scanner;

// E305- Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla el
// ingreso. Si se ingresa cero o un numero negativo, debe informar error pero continuar el ingreso. Si el
// usuario ingresa -99 debe salir del lazo.
public class Eje_305 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

// entrada
        System.out.println("Ingrese numeros, -99 para salir:");
        int numero = 0;

        do {
            numero = sc.nextInt();
            System.out.println(numero);
            if (numero <= 0) {
                System.out.println("Error");
            }
        } while (numero != -99);
    }
}
