// clase Cuenta
package ejer_401;

public class Cuenta {

    // atributos: titular y cantidad
    public String titular;
    private double cantidad;

    // metodos  ingresar(double cantidad)
    //          retirar(double cantidad)
    //          ver_saldo():
    public void ingresar(double cantidad) {
        this.cantidad = this.cantidad + cantidad;
    }

    public void retirar(double cantidad) {
        this.cantidad = this.cantidad - cantidad;
    }

    public double ver_saldo() {
        return this.cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }

}
