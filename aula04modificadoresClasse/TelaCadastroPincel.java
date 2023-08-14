package aula04modificadoresClasse;

import java.util.Scanner;

public class TelaCadastroPincel {
    private String cor;
    private String marca;
    private int carga;
    private int tamanho;
    private float espessura; 

    public String getCor() {
        return this.cor;        
    }
    public String getMarca() {
        return this.marca;
    }
    public int getCarga() {
        return this.carga;
    }
    public int getTamanho() {
        return this.tamanho;
    }
    public float getEspessura() {
        return this.espessura;
    }

    public void desenhaTelaCadastroPincel() {
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

        input.close();
    }
}
