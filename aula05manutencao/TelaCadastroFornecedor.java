package aula05manutencao;

import java.util.Scanner;

public class TelaCadastroFornecedor extends TelaCadastroPessoaJuridica {
    private String descricaoProduto;

    public String getDescricaoProduto() {
        return descricaoProduto;
    }
    
    public void desenhaTelaCadastroFornecedor() {
        Scanner input = new Scanner(System.in);
        this.desenhaTelaCadastroPessoaJuridica();

        System.out.print("Descrição do produto: ");
        this.descricaoProduto = input.nextLine();        
    } 
}
