package meerkat.ops.eliminar;

import meerkat.ops.eliminar.implementacion.Delfin;
import meerkat.ops.eliminar.implementacion.Perro;

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
