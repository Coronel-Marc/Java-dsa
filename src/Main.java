import Bicharada.Cachorro;
import Bicharada.PorteGrande;
import Bicharada.PortePequeno;

public class Main {
    public static void main(String[] args) {

        Cachorro chiuaua = new PortePequeno();
        chiuaua.comer();
        chiuaua.dormir();
        chiuaua.fazerSom();
        System.out.println(Cachorro.getQuantidade());

        Cachorro doberman = new PorteGrande();
        doberman.fazerSom();
        System.out.println(Cachorro.getQuantidade());

    }

}

