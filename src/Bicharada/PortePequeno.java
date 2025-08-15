package Bicharada;

public final class PortePequeno extends Cachorro{


    @Override
    public void dormir() {
        super.dormir();
    }

    @Override
    public void fazerSom() {
        System.out.println("Latindo baixo");
    }

    @Override
    public void comer() {
        super.comer();
    }
    public PortePequeno(){
        quantidade=+1;
    }

}
