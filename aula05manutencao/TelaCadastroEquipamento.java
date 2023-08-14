package aula05manutencao;

import java.util.Scanner;
import java.sql.Date;

public class TelaCadastroEquipamento {
    private String id;
    private String nome;
    private String modelo;
    private String fornecedor;
    private Date dataAquisicao;
    private Boolean ativo;

    public String getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getModelo() {
        return modelo;
    }
    public String getFornecedor() {
        return fornecedor;
    }
    public Date getDataAquisicao() {
        return dataAquisicao;
    }
    public Boolean getAtivo() {
        return ativo;
    }

    public void desenhaTelaCadastroEquipamento() {
        Scanner inputEquipamento = new Scanner(System.in);

        System.out.println("\nINFORME OS DADOS DO EQUIPAMENTO\n");
        System.out.print("Id...............: ");
        this.id = inputEquipamento.nextLine();

        System.out.print("Nome.............: ");
        this.nome = inputEquipamento.nextLine();

        System.out.print("Modelo...........: ");
        this.modelo = inputEquipamento.nextLine();

        System.out.print("Fornecedor.......: ");
        this.fornecedor = inputEquipamento.nextLine();

        System.out.print("Data de aquisição: ");
        this.dataAquisicao = Date.valueOf(inputEquipamento.nextLine());

        System.out.print("Equipamento ativo: ");
        this.ativo = Boolean.parseBoolean(inputEquipamento.nextLine());
    }   
}
