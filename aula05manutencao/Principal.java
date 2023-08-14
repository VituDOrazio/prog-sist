package aula05manutencao;

public class Principal {
    public static void main(String[] args) {
        Computador computador01 = new Computador();
        TelaCadastroComputador telaCadastroComputador = new TelaCadastroComputador();

        telaCadastroComputador.desenhaTelaCadastroComputador();

        computador01.setId(telaCadastroComputador.getId());
        computador01.setNome(telaCadastroComputador.getNome());
        computador01.setModelo(telaCadastroComputador.getModelo());;
        computador01.setFornecedor(telaCadastroComputador.getFornecedor());
        computador01.setDataAquisicao(telaCadastroComputador.getDataAquisicao());
        computador01.setAtivo((telaCadastroComputador.getAtivo()));
        computador01.setCpu(telaCadastroComputador.getCpu());
        computador01.setMemoriaRam(telaCadastroComputador.getMemoriaRam());
        computador01.setSoftware(telaCadastroComputador.getSoftware());

        System.out.println(computador01.toString());
        
    }
}
