package aula05manutencao;

import java.sql.Date;

public class Equipamento {
    private String id;
    private String nome;
    private String modelo;
    private String fornecedor;
    private Date dataAquisicao;
    private Boolean ativo;

    //CONSTRUTOR
    public Equipamento() {
        
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
    public Date getDataAquisicao() {
        return dataAquisicao;
    }
    public void setDataAquisicao(Date dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }
    public Boolean getAtivo() {
        return ativo;
    }
    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String toString() {
        return(
            "\n********** DADOS DO EQUIPAMENTO ***********" +
            "\nId...............: " + this.getId() +
            "\nNome.............: " + this.getNome() +
            "\nModelo...........: " + this.getModelo() +
            "\nFornecerdor......: " + this.getFornecedor() +
            "\nData de aquisição: " + this.getDataAquisicao() +
            "\nEquipamento ativo: " + this.getAtivo() +
            "\n*******************************************"
        );
    }

}

