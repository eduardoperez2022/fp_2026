package eje_e453;

public class Eje_E453 {

    public static void main(String[] args) {

        producto pro1 = new producto();

        pro1.setNombre("Teclado");
        pro1.setPrecio(50000);
        System.out.println(pro1.toString());

        System.out.println("Final: " + pro1.precioFinal());

    }

}
