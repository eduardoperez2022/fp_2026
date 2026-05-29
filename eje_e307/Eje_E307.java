package eje_e307;

import java.util.Scanner;

public class Eje_E307 {

// Escribir un programa que pida al usuario un número entero positivo
// vaya acumulando la suma de lo ingresado. Si se ingresa un numero negativo,
// debe también sumar como negativo. Debe salir del lazo cuando la suma sea
// mayor a 1000. Por cada ingreso informar el valor de la suma actual
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int suma = 0;

        System.out.println("Ingrese numeros :");

        while (suma <= 1000) {
            int numx = sc.nextInt();
            suma = suma + numx;
            System.out.println("suma parcal: :" + suma);
        }

    }

}
