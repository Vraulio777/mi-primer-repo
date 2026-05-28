package herencia.implementacion;

import herencia.interfaces.Animal;

public class Delfin implements Animal {

    @Override
    public boolean alimentarse() {
        System.out.println("Alimentandose de calamares");
        return true;
    }

    @Override
    public void desplazarse() {
        System.out.println("Nadando feli");

    }

    @Override
    public void dormir(int minutos) {
        System.out.println("Durmiendo nadando por "+minutos+" minutos en el mar");
    }
}
