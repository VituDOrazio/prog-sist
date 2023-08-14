package aula05manutencao;

import java.util.Scanner;

public class TelaCadastroComputador extends TelaCadastroEquipamento {
    private String cpu;
    private String memoriaRam;
    private String software;

    public String getCpu() {
        return cpu;
    }
    public String getMemoriaRam() {
        return memoriaRam;
    }
    public String getSoftware() {
        return software;
    }

    public void desenhaTelaCadastroComputador() {
        Scanner inputComputador = new Scanner(System.in);
        this.desenhaTelaCadastroEquipamento();

        System.out.print("Processador (CPU): ");
        this.cpu = inputComputador.nextLine();

        System.out.print("Memória RAM......: ");
        this.memoriaRam = inputComputador.nextLine();

        System.out.print("Software.........: ");
        this.software = inputComputador.nextLine();
    }

}
