package eje_204b;

// E204- Para tributar un determinado impuesto se debe ser mayor de 16 años y 
// tener unos ingresos iguales o superiores a 1000 € mensuales. Escribir un 
// programa que pregunte al usuario su edad y sus ingresos mensuales y muestre
// por pantalla si el usuario tiene que tributar o no

import java.util.Scanner;

public class Eje_E204 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // entrada
        System.out.println("Ingrese edad e ingresos:");
        int edad = sc.nextInt();
        int ingresos = sc.nextInt();
        
        // proceso 16 años 1000 euros
        if ( (edad > 16) && (ingresos >= 1000) ) {
            System.out.println("La persona Si tributa");
        }
        else {
            System.out.println("La persona No tributa");
        }

    }
    
}

