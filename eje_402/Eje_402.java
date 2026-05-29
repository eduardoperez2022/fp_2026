// codigo de prueba de la clase Libro
package eje_402;

public class Eje_402 {

    public static void main(String[] args) {
// TODO code application logic here

        Libro lib1 = new Libro("La Cenicienta", "Osvaldo Ruiz", 5, 0);
        System.out.println(lib1.toString());

// prestamos
        boolean resu = lib1.prestamo();
        System.out.println("Prestamo: " + resu);

        resu = lib1.prestamo();
        System.out.println("Prestamo: " + resu);

        resu = lib1.prestamo();
        System.out.println("Prestamo: " + resu);

        resu = lib1.prestamo();
        System.out.println("Prestamo: " + resu);

        resu = lib1.prestamo();
        System.out.println("Prestamo: " + resu);

        resu = lib1.prestamo();
        System.out.println("Prestamo: " + resu);

        System.out.println("------------------------------");
        boolean resu_dev = lib1.devolucion();
        System.out.println("Devolucion: " + resu_dev);

        resu_dev = lib1.devolucion();
        System.out.println("Devolucion: " + resu_dev);

        resu_dev = lib1.devolucion();
        System.out.println("Devolucion: " + resu_dev);

        resu_dev = lib1.devolucion();
        System.out.println("Devolucion: " + resu_dev);

        resu_dev = lib1.devolucion();
        System.out.println("Devolucion: " + resu_dev);

        resu_dev = lib1.devolucion();
        System.out.println("Devolucion: " + resu_dev);
    }

}
