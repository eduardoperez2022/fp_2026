package eje_e452;

public class circulo {

    private double radio;

    public double calcularArea() {
        double area = 0;

        area = Math.PI * Math.pow(getRadio(), 2);
        return area;
    }

    public double calcularPerimetro() {
        double perimetro = 0;

        perimetro = 2 * Math.PI * getRadio();
        return perimetro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

}
