package herencia.implementacion;

import herencia.interfaces.Animal;

public class Delfin implements Animal {

    @Override
    public boolean alimentarse() {
        System.out.println("Alimentandose de crustaceos");
        return true;
    }

    @Override
    public void desplazarse() {
        System.out.println("Nadando");

    }

    @Override
    public void dormir(int minutos) {
        System.out.println("Durmiendo nadando por "+minutos+" minutos");
    }
}
