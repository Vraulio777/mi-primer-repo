package herencia;

import herencia.implementacion.Delfin;
import herencia.implementacion.Perro;

public class Main {

    static void main(String[] args) {
        Perro perro = new Perro();
        Delfin delfin = new Delfin();

        System.out.println("=============>");
        perro.alimentarse();
        perro.desplazarse();
        perro.dormir(30);

        System.out.println("==============>");
        delfin.alimentarse();
        delfin.desplazarse();
        delfin.dormir(15);
    }

}
