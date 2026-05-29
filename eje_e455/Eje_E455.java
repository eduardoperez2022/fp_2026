package eje_e455;

// E455 - Diseña una clase Mascota con los atributos nombre y tipo (ej. «Perro», «Gato»).
// Añade un método hacerSonido() que imprima «Guau guau» si es un perro, «Miau miau»
// si es un gato, y un mensaje genérico para otros tipos.
public class Eje_E455 {

    public static void main(String[] args) {

        Mascota masc = new Mascota();
        masc.setTipo("Perro");
        masc.setNombre("Firulais");
        masc.hacerSonido();

        Mascota masc2 = new Mascota();
        masc2.setTipo("Gato");
        masc2.setNombre("Michifus");
        masc2.hacerSonido();

        Mascota masc3 = new Mascota();
        masc3.setTipo("Uron");
        masc3.setNombre("Felipe");
        masc3.hacerSonido();

    }

}
