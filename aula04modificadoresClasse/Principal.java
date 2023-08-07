package aula04modificadoresClasse;

public class Principal {
  public static void main(String[] args) {
   
    Pincel pincel01 = new Pincel(); 
    TelaCadastroPincel telaCadastroPincel = new TelaCadastroPincel();

    telaCadastroPincel.desenhaTelaCadastroPincel();
    
    pincel01.setCor(telaCadastroPincel.getCor());
    pincel01.setMarca(telaCadastroPincel.getMarca());
    pincel01.setCarga(telaCadastroPincel.getCarga());
    pincel01.setTamanho(telaCadastroPincel.getTamanho()); 
    pincel01.setEspessura(telaCadastroPincel.getEspessura());

    System.out.println(pincel01.toString());

  }
}
