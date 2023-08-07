package aula03vscode;

import java.util.Scanner;

public class TelaCadastroPincel {
    public String cor;
    public String marca;
    public int carga;
    public int tamanho;
    public float espessura; 

    public void desenhaTelaCadastroPincel(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nINFORME OS DADOS DO PINCEL\n");
        System.out.print("Cor.......: ");
        this.cor = input.nextLine();

        System.out.print("Marca.....: ");
        this.marca = input.nextLine();

        System.out.print("Carga.....: ");
        this.carga = input.nextInt();
        input.nextLine();

        System.out.print("Tamanho...: ");
        this.tamanho = input.nextInt();
        input.nextLine();

        System.out.print("Espessura.: ");
        this.espessura = Float.parseFloat(input.nextLine());

    }
}
