package aula05manutencao;

import java.util.Scanner;

public class TelaCadastroPessoaJuridica extends TelaCadastroPessoa {
    private String cnpj;

    protected String getCnpj() {
        return cnpj;
    }

    protected void desenhaTelaCadastroPessoaJuridica() {
        Scanner input = new Scanner(System.in);
        this.desenhaTelaCadastroPessoa();

        System.out.print("CNPJ......: ");
        this.cnpj = input.nextLine();    
    }
    
}
