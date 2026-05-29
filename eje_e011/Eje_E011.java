package eje_e011;

import java.util.Scanner;

// E011- Realiza un programa que calcule la aceptación de una solicitud en base
// a los siguientes parámetros: edad, nota y sexo.*
// Mínimo: Nota (5), edad (18), sexo M -> POSIBLE*
// Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA*
// Otros casos -> NO ACEPTADA
public class Eje_E011 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

// entrada
        System.out.println("Ingrese nota, edad y sexo (F/M) :");

        int nota = sc.nextInt();
        int edad = sc.nextInt();
        String sexo = sc.next();

// proceso
        String mensaje = "NO ACEPTADA";
        if (nota >= 5) {
            if (edad >= 18) {
                if (sexo.equals("F")) {
                    mensaje = "ACEPTADA";
                } else if (sexo.equals("M")) {
                    mensaje = "POSIBLE";
                }
            }
        }

// salida
        System.out.println("Condicion: " + mensaje);
    }
}
