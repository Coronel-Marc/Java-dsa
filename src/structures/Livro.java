package structures;

public class Livro {
    String titulo;
    String autor;
    int ano;

    public Livro (String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String exibirInfo(){

        return "Título: "+titulo+" - Autor: "+autor+" - Ano: "+ano;
    }
}
