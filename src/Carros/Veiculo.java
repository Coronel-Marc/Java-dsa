package Carros;

public interface Veiculo {
    public String placa = "";
    public float velocidadeMaxima = 0;

    public void iniciarMotor();
    public void desligarMotor();

    default void buzinar() {
        System.out.println("Buzinando");
    }


}
