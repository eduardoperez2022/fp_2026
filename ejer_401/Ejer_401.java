// codigo de prueba

package ejer_401;

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