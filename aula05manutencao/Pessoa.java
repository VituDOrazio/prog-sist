package aula05manutencao;

public class Pessoa {
    private String id;
    private String nome;
    private String endereco;
    private String telefone;

    protected String getId() {
        return id;
    }
    protected void setId(String id) {
        this.id = id;
    }
    protected String getNome() {
        return nome;
    }
    protected void setNome(String nome) {
        this.nome = nome;
    }
    protected String getEndereco() {
        return endereco;
    }
    protected void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    protected String getTelefone() {
        return telefone;
    }
    protected void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
