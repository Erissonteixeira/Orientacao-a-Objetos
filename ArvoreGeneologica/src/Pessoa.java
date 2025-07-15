import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private int idade;
    private Pessoa pai;
    private Pessoa mae;


    public Pessoa(String nome, int idade,Pessoa pai, Pessoa mae){
        this.nome = nome;
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;

    }

     static class Pai extends Pessoa {
        public Pai(String nome, int idade, Pessoa pai, Pessoa mae){
            super(nome, idade, pai, mae);

            System.out.println("Nome do pai: " + nome);
            System.out.println("Idade registrada: " + idade);
            System.out.println("Filho de: " + pai.nome + " & " + mae.nome + "\n");
        }

        static class Mae extends Pessoa{
            public Mae(String nome, int idade, Pessoa pai, Pessoa mae){
                super(nome, idade, pai, mae);
                System.out.println("Nome da mãe: " + nome);
                System.out.println("Idade registrada: " + idade);

            }
        }

        static class Filho extends Pessoa {
            public Filho(String nome, int idade, Pessoa pai, Pessoa mae){
                super(nome, idade, pai, mae);
                System.out.println("Nome do filho: " + nome);
                System.out.println("Idade registrada: " + idade);
                System.out.println();
            }
        }

    }
}
