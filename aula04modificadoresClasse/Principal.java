package aula03vscode;

public class Principal {
  public static void main(String[] args) {
   
    Pincel pincel01 = new Pincel();
    TelaCadastroPincel telaCadastroPincel = new TelaCadastroPincel();

    telaCadastroPincel.desenhaTelaCadastroPincel();
    
    pincel01.cor       = telaCadastroPincel.cor;
    pincel01.marca     = telaCadastroPincel.marca;
    pincel01.carga     = telaCadastroPincel.carga;
    pincel01.tamanho   = telaCadastroPincel.tamanho;
    pincel01.espessura = telaCadastroPincel.espessura;

    System.out.println("\nDADOS DO PINCEL\n");
    System.out.println("Cor.......: " + pincel01.cor);
    System.out.println("Marca.....: " + pincel01.marca);
    System.out.println("Carga.....: " + pincel01.carga);
    System.out.println("Tamanho...: " + pincel01.tamanho);
    System.out.println("Espessura.: " + pincel01.espessura);

  }
}
