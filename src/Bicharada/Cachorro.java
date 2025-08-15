package Bicharada;

public abstract class Cachorro implements Animal{

    static int quantidade = 0;

    public static int getQuantidade() {
        return quantidade;
    }

    @Override
    public void comer() {
        System.out.println("Comendo...");
    }

    @Override
    public void dormir() {
        System.out.println("Dormindo...");
    }

    @Override
    public void fazerSom() {
        System.out.println("Cachorro está latindo");
    }

    public Cachorro(){
        quantidade+=1;
    }
}
