package aula05manutencao;

public class Fornecedor extends PessoaJuridica {
    private String descricaoProduto;

    public String getDescricaoProduto() {
        return descricaoProduto;
    }
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public String toString() {
        return(
            "\n**************** DADOS DO FORNECEDOR ****************" +
            "\nId..................: " + this.getId() +
            "\nNome................: " + this.getNome() +
            "\nEndereço............: " + this.getEndereco() + 
            "\nTelefone............: " + this.getTelefone() +
            "\nCNPJ................: " + this.getCnpj() +
            "\nDescrição do Produto: " + this.getDescricaoProduto() +
            "\n*****************************************************"
        );
    }
}
