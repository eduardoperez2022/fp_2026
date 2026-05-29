package eje_e451_v2;

public class rectangulo {
    // atributos
    private int ancho=0;
    private int alto=0;
            
    // metodos
    public int calcularArea() {
        int elarea = 0;
        elarea = this.getAncho()*this.getAlto();
        return elarea;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
}

