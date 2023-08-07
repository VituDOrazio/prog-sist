package aula04modificadoresClasse;

public class Pincel {
    private String cor;
    private String marca;
    private int carga;
    private int tamanho;
    private float espessura;

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return this.cor;        
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getCarga() {
        return this.carga;
    }
    
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void setEspessura(float espessura) {
        this.espessura = espessura;
    }

    public float getEspessura() {
        return this.espessura;
    }
}
