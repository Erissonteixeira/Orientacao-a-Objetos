import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nome;
    private String idUsuario;
    private List<Tarefas> tarefa = new ArrayList<>();

    public Usuario(String nome, String idUsuario){
        this.nome = nome;
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public String getIdUsuario() {
        return idUsuario;
    }
    public void adicionarTarefa(Tarefas tarefa){

    }

    public void removerTareca(int idTarefa){

    }
    public void listarTarefas(){

    }
    public void tarefasPendentes(){

    }

    public void concluirTarefa(int idaTarefa){

    }
    public void editarTarefa(int idTarefa, String novoTitulo, String novaDescricao, String novaDataVencimento){

    }

}
