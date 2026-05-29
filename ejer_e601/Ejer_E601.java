// ejercicio 601 (String)
package ejer_e601;

import java.util.Scanner;

/*
1 – Calcular el largo del texto ingresado. Informarlo.
2 - Verificar que al menos tiene un asterisco. Informarlo
3 – Verificar si el texto comienza y/o termina con un espacio. Informarlo.
4 – Crear un nuevo String, habiendo reemplazado las letras ‘a’ por un signo ‘$’. Imprimir a consola.
5 - Crear un nuevo String, habiendo quitado los espacios del inicio y del final. Imprimir a consola.
6 - Buscar la posición donde aparece el primer asterisco. Informarlo
 */
public class Ejer_E601 {

    public static void main(String[] args) {

// ejercicio eje = new ejercicio();
// eje.solucion();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un texto: ");

        String eltexto = sc.nextLine();

        int largo = eltexto.length();
        System.out.println("Largo: " + largo);

        boolean astericook = eltexto.contains("*");
        System.out.println("Asterisco: " + astericook);

        boolean e1 = eltexto.startsWith(" ");
        System.out.println("Empieza: " + e1);

        boolean e2 = eltexto.endsWith(" ");
        System.out.println("Termina: " + e2);

        String rempla = eltexto.replace("a", "$");
        System.out.println("Reemplazo: " + rempla);

        String sinespacio = eltexto.trim();
        System.out.println("Sin espacio: " + sinespacio);

        int posi = eltexto.indexOf("*");
        System.out.println("Posicion *: " + posi);

    }

}
