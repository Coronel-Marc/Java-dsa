import structures.Calculadora;
import structures.Livro;
import structures.Pessoa;

public class Main {
    public static void main (String[] args) {
        Livro livro = new Livro("Senhor dos Aneis","Tolkien",1999);

        System.out.println(livro.exibirInfo());


    }

}

/*
 * Roadmap JAVA
 *
 * Nível Iniciante:
 * - Variaveis                                       OK
 *   Basico de qualquer linguagem                    OK
 *
 * - Tipagem de dados                                OK
 *   - Saber declarar                                OK
 *
 * - Dados primitivos                                OK
 *   - Int, short, float, double                     OK
 *
 * - Dados não-primitivos                            OK
 *    - Somente String por enquanto                  OK
 *
 * - Estruturas de Controle                          OK
 *   - If,Else, Switch, Else-if, ternarios           OK
 *
 * - Estruturas de repetição                         OK
 *   - For, While, Do-While                          OK
 *
 * - Métodos e Parametros                            OK
 *   - Aprender a criar os proprios métodos          OK
 *
 * - Arrays                                          OK
 *   - Aprender a usar métodos de arrays             OK
 *
 * ========================================
 *
 * Nível intermediário:
 *
 * - Classes e Objetos
 *   - Saber como funcionar, diferenças, POJO
 *
 * - Construtores
 *   - Saber criar construtores com e sem argumentos
 *
 * - Modificador de Acesso
 *   - Saber trabalhar com Public, Private, Protected
 *
 * - Orientação a Objetos
 *   - Herança
 *   - Polimoforfismo
 *   - Encapsulamento
 *
 * - Interfaces
 *
 * - Classes Abstratas
 *
 * - Enums
 *
 * - Generics
 *
 * - Lambdas
 *
 * - Collections
 *
 * =========================================
 *
 * Menções Honrosas:
 *
 * - Annotations
 *
 * - Exceções
 *
 * =========================================
 *
 * Nível Avançado:
 *
 * - Java Memory Model (JMM)
 *
 * - Garbage Collection
 *   - Seria, Parallel, CMS, G1, ZGC, Shenandoah
 *
 * - Reflection API
 *
 * - RESTful Web Services
 *   - JAX-RS (Jersey), Spring Boot, e integração com JSON/XML
 *
 * - Padrões de Projeto
 *   - Singleton, Factory, Observer e Command
 *
 * - Spring Framework
 * */

