package Praticando.Exercicios1.Carro;

public class Carro {
    private String modelo;
    private String cor;
    private int ano;

    public void fichaTecnica() {
        System.out.println("Modelo do carro: " + getModelo());
        System.out.println("Cor: " + getCor());
        System.out.println("Ano de lançamento: " + getAno());
    }

    public int idadeDoCarro() {
        int anoAtual = java.time.Year.now().getValue();
        return anoAtual - getAno();
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
}
