import java.util.Locale;

public class Tarefas {

    private int id;
    private String titulos;
    private String descricao;
    private String dataCriacao;
    private String dataVencimento;
    private boolean concluida;

    public Tarefas(String titulos, String descricao, String dataCriacao, String dataVencimento, boolean concluida){
        this.titulos = titulos;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.dataVencimento = dataVencimento;

    }

    public int getId() {
        return id;
    }

    public String getTitulos() {
        return titulos;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "Tarefas{" +
                "id=" + id +
                ", titulos='" + titulos + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataCriacao='" + dataCriacao + '\'' +
                ", dataVencimento='" + dataVencimento + '\'' +
                ", concluida=" + concluida +
                '}';
    }
}

