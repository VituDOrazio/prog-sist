package aula05manutencao;

import java.util.Scanner;

public class TelaCadastroPessoa {
    private String id;
    private String nome;
    private String endereco;
    private String telefone;

    protected String getId() {
        return id;
    }
    protected String getNome() {
        return nome;
    }
    protected String getEndereco() {
        return endereco;
    }
    protected String getTelefone() {
        return telefone;
    }

    protected void desenhaTelaCadastroPessoa() {
        Scanner input = new Scanner(System.in);

        System.out.println("\nINFORME OS DADOS PARA CADASTRO\n");
        System.out.print("Id........: ");
        this.id = input.nextLine();
        System.out.print("Nome......: ");
        this.nome = input.nextLine();
        System.out.print("Endereço..: ");
        this.endereco = input.nextLine();
        System.out.print("Telefone..: ");
        this.telefone = input.nextLine();
    }
}
