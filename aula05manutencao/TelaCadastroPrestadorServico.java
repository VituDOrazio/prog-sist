package aula05manutencao;

import java.util.Scanner;

public class TelaCadastroPrestadorServico extends TelaCadastroPessoaJuridica {
    private String descricaoServico;

    public String getDescricaoServico() {
        return descricaoServico;
    }

    public void desenhaTelaCadastroPrestadorServico() {
        Scanner input = new Scanner(System.in);
        this.desenhaTelaCadastroPessoaJuridica();

        System.out.print("Descrição do serviço: ");
        this.descricaoServico = input.nextLine();
    }
    
}
