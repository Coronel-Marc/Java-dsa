package Carros;

public class Carro implements Veiculo{
    public String placa = "";
    public float velocidadeMaxima = 100;

    public void iniciarMotor(){
        System.out.println("Ligando motor...");
    }
    public void desligarMotor(){
        System.out.println("Desligando motor...");
    }


}
