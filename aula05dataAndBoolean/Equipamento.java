package aula05dataAndBoolean;

import java.sql.Date;

public class Equipamento {
    private String idEquipamento;
    private String nomeEquipamento;
    private String modeloEquipamento;
    private String fornecedorEquipamento;
    private Date dataAquisicaoEquipamento;
    private Boolean equipamentoAtivo;

    public String getIdEquipamento() {
        return idEquipamento;
    }
    public void setIdEquipamento(String idEquipamento) {
        this.idEquipamento = idEquipamento;
    }
    public String getNomeEquipamento() {
        return nomeEquipamento;
    }
    public void setNomeEquipamento(String nomeEquipamento) {
        this.nomeEquipamento = nomeEquipamento;
    }
    public String getModeloEquipamento() {
        return modeloEquipamento;
    }
    public void setModeloEquipamento(String modeloEquipamento) {
        this.modeloEquipamento = modeloEquipamento;
    }
    public String getFornecedorEquipamento() {
        return fornecedorEquipamento;
    }
    public void setFornecedorEquipamento(String fornecedorEquipamento) {
        this.fornecedorEquipamento = fornecedorEquipamento;
    }
    public Date getDataAquisicaoEquipamento() {
        return dataAquisicaoEquipamento;
    }
    public void setDataAquisicaoEquipamento(Date dataAquisicaoEquipamento) {
        this.dataAquisicaoEquipamento = dataAquisicaoEquipamento;
    }
    public Boolean getEquipamentoAtivo() {
        return equipamentoAtivo;
    }
    public void setEquipamentoAtivo(Boolean equipamentoAtivo) {
        this.equipamentoAtivo = equipamentoAtivo;
    }

    public String toString() {
        String report;

        report =    "\n********** DADOS DO EQUIPAMENTO ***********\n" +
                    " Id...............: " + getIdEquipamento() + "\n" +
                    " Nome.............: " + getNomeEquipamento() + "\n" +
                    " Modelo...........: " + getModeloEquipamento() + "\n" +
                    " Fornecerdor......: " + getFornecedorEquipamento() + "\n" +
                    " Data de aquisição: " + getDataAquisicaoEquipamento() + "\n" +
                    " Equipamento ativo: " + getEquipamentoAtivo() +
                    "\n*******************************************\n";

        return report;
    }

}

