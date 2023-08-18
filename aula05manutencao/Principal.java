package aula05manutencao;

public class Principal {
    public static void main(String[] args) {
    /* Teste para Pessoa <- PessoaFisica */
        PessoaFisica cliente1 = new PessoaFisica();
        TelaCadastroPessoaFisica telaCadastroPessoaFisica = new TelaCadastroPessoaFisica();

        telaCadastroPessoaFisica.desenhaTelaCadastroPessoaFisica();

        cliente1.setId(telaCadastroPessoaFisica.getId());
        cliente1.setNome(telaCadastroPessoaFisica.getNome());
        cliente1.setEndereco(telaCadastroPessoaFisica.getEndereco());
        cliente1.setTelefone(telaCadastroPessoaFisica.getTelefone());
        cliente1.setCpf(telaCadastroPessoaFisica.getCpf());
        System.out.println(cliente1.toString());

    /* Teste para Pessoa <- PessoaJuridica */
        PessoaJuridica empresa = new PessoaJuridica();
        TelaCadastroPessoaJuridica telaCadastroPessoaJuridica = new TelaCadastroPessoaJuridica();

        telaCadastroPessoaJuridica.desenhaTelaCadastroPessoaJuridica();

        empresa.setId(telaCadastroPessoaJuridica.getId());
        empresa.setNome(telaCadastroPessoaJuridica.getNome());
        empresa.setEndereco(telaCadastroPessoaJuridica.getEndereco());
        empresa.setTelefone(telaCadastroPessoaJuridica.getTelefone());
        empresa.setCnpj(telaCadastroPessoaJuridica.getCnpj());
        System.out.println(empresa.getId());
        System.out.println(empresa.getNome());
        System.out.println(empresa.getEndereco());
        System.out.println(empresa.getTelefone());
        System.out.println(empresa.getCnpj());
        
    /* Teste para Pessoa <- PessoaJuridica <- Fornecedor */
        Fornecedor fornecedor1 = new Fornecedor();
        TelaCadastroFornecedor telaCadastroFornecedor = new TelaCadastroFornecedor();

        telaCadastroFornecedor.desenhaTelaCadastroFornecedor();

        fornecedor1.setId(telaCadastroFornecedor.getId());
        fornecedor1.setNome(telaCadastroFornecedor.getNome());   
        fornecedor1.setEndereco(telaCadastroFornecedor.getEndereco());
        fornecedor1.setTelefone(telaCadastroFornecedor.getTelefone());
        fornecedor1.setCnpj(telaCadastroFornecedor.getCnpj());
        fornecedor1.setDescricaoProduto(telaCadastroFornecedor.getDescricaoProduto());
        System.out.println(fornecedor1.toString());

    /* Teste para Pessoa <- PessoaJuridica <- PrestadorServico */
        PrestadorServico prestadorServico1 = new PrestadorServico();
        TelaCadastroPrestadorServico telaCadastroPrestadorServico = new TelaCadastroPrestadorServico();

        telaCadastroPrestadorServico.desenhaTelaCadastroPrestadorServico();

        prestadorServico1.setId(telaCadastroPrestadorServico.getId());
        prestadorServico1.setNome(telaCadastroPrestadorServico.getNome());
        prestadorServico1.setEndereco(telaCadastroPrestadorServico.getEndereco());
        prestadorServico1.setTelefone(telaCadastroPrestadorServico.getTelefone());
        prestadorServico1.setCnpj(telaCadastroPrestadorServico.getCnpj());
        prestadorServico1.setDescricaoServico(telaCadastroPrestadorServico.getDescricaoServico());
        System.out.println(prestadorServico1.toString());

    /* Teste para Equipamento <- Computador */
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
