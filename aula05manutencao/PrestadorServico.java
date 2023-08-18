package aula05manutencao;

public class PrestadorServico extends PessoaJuridica {
    private String descricaoServico;

    public String getDescricaoServico() {
        return descricaoServico;
    }
    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico = descricaoServico;
    }
    
    public String toString() {
        return(
            "\n********** DADOS DO PRESTADOR DE SERVIÇOS ***********" +
            "\nId..................: " + this.getId() +
            "\nNome................: " + this.getNome() +
            "\nEndereço............: " + this.getEndereco() + 
            "\nTelefone............: " + this.getTelefone() +
            "\nCNPJ................: " + this.getCnpj() +
            "\nDescrição do Serviço: " + this.getDescricaoServico() +
            "\n*****************************************************"
        );
    }
}
