package Carros;

public final class Corsa extends Carro{

    @Override
    public void iniciarMotor() {
        System.out.println("Iniciando motor 1.0...");
    }

    @Override
    public void desligarMotor() {
        super.desligarMotor();
    }
}
