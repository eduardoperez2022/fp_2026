// codigo de prueba

package ejer_401;

//E401 - Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad 
//(puede tener decimales).
//Tendrá dos métodos especiales:
//- ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es 
//negativa, no se hará nada.
//- retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a 
//la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.
//- ver_saldo(): este método devuelve el saldo de la cuenta, con decimales.

public class Ejer_401 {

    public static void main(String[] args) {
        
        System.out.println("Probando cuenta:");
        
        // ingreso
        Cuenta micuenta = new Cuenta();
        micuenta.titular = "Juan Garcia";
        micuenta.ingresar(20000);
        System.out.println(micuenta.toString());
        
        // retiro
        micuenta.retirar(12000); 
        System.out.println(micuenta.toString());
        
        // ingreso
        Cuenta otracuenta = new Cuenta();
        otracuenta.titular = "Maria Sosa";
        otracuenta.ingresar(200000);
        System.out.println(otracuenta.toString());
        
        // retiro
        otracuenta.retirar(150000); 
        System.out.println(otracuenta.toString());

        // saldo consolidado de ambas cuentas
        double consolidado = micuenta.ver_saldo() + otracuenta.ver_saldo();
        System.out.println("El consolidado es; " + consolidado);
        
    }
    
}
