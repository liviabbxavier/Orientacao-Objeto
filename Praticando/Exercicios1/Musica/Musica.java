package Praticando.Exercicios1.Musica;

public class Musica {
    private String titulo;
    private String artista;
    private int anoDeLancamento;
    private double avaliacao;
    private int numAvaliacao;

    public void avalia(double nota) {
        avaliacao += nota;
        numAvaliacao++;
    }
    
    public double media() {
        return getAvaliacao() / getNumAvaliacao();
    }

    public void fichaTecnica() {
        System.out.println("Nome: " + getTitulo());
        System.out.println("Artista: " + getArtista());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getNumAvaliacao() {
        return numAvaliacao;
    }

    public void setNumAvaliacao(int numAvaliacao) {
        this.numAvaliacao = numAvaliacao;
    }

    
}
