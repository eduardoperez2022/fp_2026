// demo_bicicleta
package demo_bicicleta;

public class Demo_bicicleta {

    public static void main(String[] args) {

        bicicleta miBicicleta = new bicicleta();
        miBicicleta.velocidadActual = 15;
        miBicicleta.platoActual = 2;
        miBicicleta.pinonActual = 3;

        System.out.println("Velocidad actual:" + miBicicleta.velocidadActual);

        miBicicleta.acelerar();
        System.out.println("Velocidad actual:" + miBicicleta.velocidadActual);

        miBicicleta.frenar();
        miBicicleta.frenar();
        System.out.println("Velocidad actual:" + miBicicleta.velocidadActual);

        System.out.println("-------------------------");
        System.out.println("Plato actual:" + miBicicleta.platoActual);
        System.out.println("Pinon actual:" + miBicicleta.pinonActual);

        miBicicleta.platoActual = 4;
        miBicicleta.pinonActual = 5;

        System.out.println("-------------------------");
        System.out.println("Plato actual:" + miBicicleta.platoActual);
        System.out.println("Pinon actual:" + miBicicleta.pinonActual);

        System.out.println("-------------------------");
        System.out.println("-------------------------");

        bicicleta tuBicicleta = new bicicleta();
        tuBicicleta.velocidadActual = 25;
        tuBicicleta.platoActual = 3;
        tuBicicleta.pinonActual = 4;

        System.out.println("Velocidad actual:" + tuBicicleta.velocidadActual);
        System.out.println("Plato actual:" + tuBicicleta.platoActual);
        System.out.println("Pinon actual:" + tuBicicleta.pinonActual);

// cual va mas rapido
        if (miBicicleta.velocidadActual > tuBicicleta.velocidadActual) {
            System.out.println("Mi Bici es mas rapida");
        } else {
            System.out.println("Tu Bici es mas rapida");
        }

    }

}


