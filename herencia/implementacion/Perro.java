package herencia.implementacion;

import herencia.interfaces.Animal;

public class Perro implements Animal {

    @Override
    public boolean alimentarse(){
        System.out.println("Alimentandose de croquetas");
        return true;
    }

    @Override
    public void desplazarse() {
        System.out.println("Caminando");
    }

    @Override
    public void dormir(int minutos) {
        System.out.println("Durmiendo acostado " + minutos + " por min");
    }
}
