package aula05dataAndBoolean;

import java.util.Scanner;
import java.sql.Date;

public class TelaCadastroEquipamento {
    private String idEquipamento;
    private String nomeEquipamento;
    private String modeloEquipamento;
    private String fornecedorEquipamento;
    private Date dataAquisicaoEquipamento;
    private Boolean equipamentoAtivo;

    public void desenhaTelaCadastroEquipamento() {
        Scanner input = new Scanner(System.in);

        System.out.println("\nINFORME OS DADOS DO EQUIPAMENTO\n");
        System.out.print("Id...............: ");
        this.idEquipamento = input.nextLine();

        System.out.print("Nome.............: ");
        this.nomeEquipamento = input.nextLine();

        System.out.print("Modelo...........: ");
        this.modeloEquipamento = input.nextLine();

        System.out.print("Fornecedor.......: ");
        this.fornecedorEquipamento = input.nextLine();

        System.out.print("Data de aquisição: ");
        this.dataAquisicaoEquipamento = Date.valueOf(input.nextLine());

        System.out.print("Equipamento ativo: ");
        this.equipamentoAtivo = Boolean.parseBoolean(input.nextLine());
    }   

    public String getIdEquipamento() {
        return idEquipamento;
    }
    public String getNomeEquipamento() {
        return nomeEquipamento;
    }
    public String getModeloEquipamento() {
        return modeloEquipamento;
    }
    public String getFornecedorEquipamento() {
        return fornecedorEquipamento;
    }
    public Date getDataAquisicaoEquipamento() {
        return dataAquisicaoEquipamento;
    }
    public Boolean getEquipamentoAtivo() {
        return equipamentoAtivo;
    }
}
