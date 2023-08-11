package aula05dataAndBoolean;

public class Principal {
    public static void main(String[] args) {
        Equipamento equipamento01 = new Equipamento();
        TelaCadastroEquipamento telaCadastroEquipamento = new TelaCadastroEquipamento();

        telaCadastroEquipamento.desenhaTelaCadastroEquipamento();

        equipamento01.setIdEquipamento(telaCadastroEquipamento.getIdEquipamento());
        equipamento01.setNomeEquipamento(telaCadastroEquipamento.getNomeEquipamento());
        equipamento01.setModeloEquipamento(telaCadastroEquipamento.getModeloEquipamento());
        equipamento01.setFornecedorEquipamento(telaCadastroEquipamento.getFornecedorEquipamento());
        equipamento01.setDataAquisicaoEquipamento(telaCadastroEquipamento.getDataAquisicaoEquipamento());
        equipamento01.setEquipamentoAtivo(telaCadastroEquipamento.getEquipamentoAtivo());

        System.out.println(equipamento01.toString());

    }
}
