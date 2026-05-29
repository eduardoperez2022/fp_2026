package eje_e455;

public class Mascota {

    private String nombre;
    private String tipo;

    public void hacerSonido() {

// «Perro», «Gato»
// Guau guau
// Miau miau
        if (tipo.equals("Perro")) {
            System.out.println("Guau guau");
        } else if (tipo.equals("Gato")) {
            System.out.println("Miau miau");
        } else {
            System.out.println("?????");
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
