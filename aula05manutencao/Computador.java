package aula05manutencao;

public class Computador extends Equipamento {
    private String cpu;
    private String memoriaRam;
    private String software;
    
    public String getCpu() {
        return cpu;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public String getMemoriaRam() {
        return memoriaRam;
    }
    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
    public String getSoftware() {
        return software;
    }
    public void setSoftware(String software) {
        this.software = software;
    }

    public String toString() {
        return(
            "\n*********** DADOS DO COMPUTADOR ***********" +
            "\nId...............: " + this.getId() +
            "\nNome.............: " + this.getNome() +
            "\nModelo...........: " + this.getModelo() +
            "\nFornecerdor......: " + this.getFornecedor() +
            "\nData de aquisição: " + this.getDataAquisicao() +
            "\nEquipamento ativo: " + this.getAtivo() +
            "\nProcessador (CPU): " + this.getCpu() +
            "\nMemória RAM......: " + this.getMemoriaRam() +
            "\nSoftware.........: " + this.getSoftware() +
            "\n*******************************************"
        );
    }
}
