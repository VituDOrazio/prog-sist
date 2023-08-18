package aula05manutencao;

import java.util.Scanner;

public class TelaCadastroPessoaFisica extends TelaCadastroPessoa {
    private String cpf;

    protected String getCpf() {
        return cpf;
    }
    
    public void desenhaTelaCadastroPessoaFisica() {
        Scanner input = new Scanner(System.in);
        this.desenhaTelaCadastroPessoa();

        System.out.print("CPF.......: ");
        this.cpf = input.nextLine();        
    }
}
