package aula04modificadoresClasse;

public class Principal {
  public static void main(String[] args) {
   
    Pincel pincel01 = new Pincel(); 
    
    pincel01.setCor("Verde");
    pincel01.setMarca("Pilot");
    pincel01.setCarga(78);
    pincel01.setTamanho(18); 
    pincel01.setEspessura(0.9f);

    System.out.println("\n\nDADOS DO PINCEL\n");
    System.out.println("Cor.......: " + pincel01.getCor());
    System.out.println("Marca.....: " + pincel01.getMarca());
    System.out.println("Carga.....: " + pincel01.getCarga());
    System.out.println("Tamanho...: " + pincel01.getTamanho());
    System.out.println("Espessura.: " + pincel01.getEspessura());

  }
}
