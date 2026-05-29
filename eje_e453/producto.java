package eje_e453;

public class producto {

// atributos
    private String nombre;
    private double precio;

    public double precioFinal() {
        double preciofin = 0;
        double iva = 21;

// preciofin = getPrecio()* 1.21;
        preciofin = getPrecio() * (1 + (iva / 100));

        return preciofin;
    }

    @Override
    public String toString() {
        return "producto{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
