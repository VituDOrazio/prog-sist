//import Pincel

public class Principal{
   public static void main (String[] args){
   //programa principal da classe Pincel
   
      //System.out.println("Hello World! || Olá Mundo");
   
      //criando um objeto Pincel
      Pincel pincel01	 = new Pincel();
      pincel01.cor	 = "Azul";
      pincel01.marca	 = "Pilot";
      pincel01.carga	 = 80;
      pincel01.tamanho	 = 15;
      pincel01.espessura = 1.8f;
      
      //obj 2
      Pincel pincel02	 = new Pincel();
      pincel02.cor	 = "Verde";
      pincel02.marca	 = "Pilot";
      pincel02.carga	 = 10;
      pincel02.tamanho	 = 15;
      pincel02.espessura = 1.8f;
      
      //obj 3
      Pincel pincel03	 = new Pincel();
      pincel03.cor	 = "Vermelho";
      pincel03.marca	 = "Pilot";
      pincel03.carga	 = 75;
      pincel03.tamanho	 = 15;
      pincel03.espessura = 1.8f;

      //obj 4
      Pincel pincel04	 = new Pincel();
      pincel04.cor	 = "Azul";
      pincel04.marca	 = "Bic";
      pincel04.carga	 = 100;
      pincel04.tamanho	 = 18;
      pincel04.espessura = 1.5f;
      
      //obj 5
      Pincel pincel05	 = new Pincel();
      pincel05.cor	 = "Roxo";
      pincel05.marca	 = "Faber-Castell";
      pincel05.carga	 = 13;
      pincel05.tamanho	 = 15;
      pincel05.espessura = 1.8f;
      
      System.out.println("A cor do pincel 01 é " + pincel01.cor);
      System.out.println("A marca do pincel 01 é " + pincel01.marca);
      System.out.println("A carga do pincel 01 está em " + pincel01.carga + " %");
      System.out.println("O tamanho do pincel 01 é " + pincel01.tamanho + " cm");
      System.out.println("A espessura do pincel 01 é " + pincel01.espessura + " cm");
      System.out.println("---------------------------------------");

      System.out.println("A cor do pincel 02 é " + pincel02.cor);
      System.out.println("A marca do pincel 02 é " + pincel02.marca);
      System.out.println("A carga do pincel 02 está em " + pincel02.carga + " %");
      System.out.println("O tamanho do pincel 02 é " + pincel02.tamanho + " cm");
      System.out.println("A espessura do pincel 02 é " + pincel02.espessura + " cm");
      System.out.println("---------------------------------------");

      System.out.println("A cor do pincel 03 é " + pincel03.cor);
      System.out.println("A marca do pincel 03 é " + pincel03.marca);
      System.out.println("A carga do pincel 03 está em " + pincel03.carga + " %");
      System.out.println("O tamanho do pincel 03 é " + pincel03.tamanho + " cm");
      System.out.println("A espessura do pincel 03 é " + pincel03.espessura + " cm");
      System.out.println("---------------------------------------");

      System.out.println("A cor do pincel 04 é " + pincel04.cor);
      System.out.println("A marca do pincel 04 é " + pincel04.marca);
      System.out.println("A carga do pincel 04 está em " + pincel04.carga + " %");
      System.out.println("O tamanho do pincel 04 é " + pincel04.tamanho + " cm");
      System.out.println("A espessura do pincel 04 é " + pincel04.espessura + " cm");
      System.out.println("---------------------------------------");

      System.out.println("A cor do pincel 05 é " + pincel05.cor);
      System.out.println("A marca do pincel 05 é " + pincel05.marca);
      System.out.println("A carga do pincel 05 está em " + pincel05.carga + " %");
      System.out.println("O tamanho do pincel 05 é " + pincel05.tamanho + " cm");
      System.out.println("A espessura do pincel 05 é " + pincel05.espessura + " cm");
      System.out.println("---------------------------------------");

   }
}
