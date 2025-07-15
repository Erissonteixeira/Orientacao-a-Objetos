public class Main {
    public static void main(String[] args) {
        Pessoa avoPaterno = new Pessoa("João", 78, null, null);
        Pessoa avoMaterna = new Pessoa("Maria", 75, null, null);
        Pessoa avoPaterna = new Pessoa("Carlos", 80, null, null);
        Pessoa avoMaterno = new Pessoa("Ana", 77, null, null);



        Pessoa.Pai pai = new Pessoa.Pai("Roberto", 50, avoPaterna, avoPaterno);
        Pessoa.Pai.Mae mae = new Pessoa.Pai.Mae("Cláudia", 48, avoMaterno, avoMaterna);

        Pessoa.Pai.Filho filho = new Pessoa.Pai.Filho("Lucas", 20, pai, mae);
    }
}