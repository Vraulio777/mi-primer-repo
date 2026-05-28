package meerkat.ops.eliminar.interfaces;

class SoloParaBorrar implements Animal{

    @Override
    public boolean alimentarse() {
        return false;
    }

    @Override
    public void desplazarse() {

    }

    @Override
    public void dormir(int minutos) {

    }
}
