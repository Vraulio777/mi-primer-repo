package meerkat.ops.eliminar;

import meerkat.ops.eliminar.implementacion.Perro;

public class Main {

    static void main(String[] args) {
        Perro perro = new Perro();
        System.out.println("=============>");
        perro.alimentarse();
        perro.desplazarse();
        perro.dormir(30);
    }

}
