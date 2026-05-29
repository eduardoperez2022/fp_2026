package demo_bicicleta;

public class bicicleta {

// atributos
    public int velocidadActual = 0;
    public int platoActual = 0;
    public int pinonActual = 0;

// metodos
    public void acelerar() {
        velocidadActual = velocidadActual * 2;
    }

    public void frenar() {
        velocidadActual = velocidadActual / 2;
    }

    public void cambiarPlato(int plato) {
        platoActual = plato;
    }

    public void cambiarPinon(int pinon) {
        pinonActual = pinon;
    }

}
