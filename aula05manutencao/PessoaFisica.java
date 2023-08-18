package aula05manutencao;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String toString() {
        return(
            "\n********** DADOS DA PESSOA FÍSICA ***********" +
            "\nId.......: " + this.getId() +
            "\nNome.....: " + this.getNome() +
            "\nEndereço.: " + this.getEndereco() + 
            "\nTelefone.: " + this.getTelefone() +
            "\nCPF......: " + this.getCpf() +
            "\n*********************************************"
        );
    }
}
