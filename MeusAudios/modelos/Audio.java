public class Audio {
    private String titulo;
    private int reproducoes;
    private double duracao;
    private int curtidas;
    private int classificacao;

    public void curte() {
        this.curtidas++;
    }

    public void reproduzir() {
        this.reproducoes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getReproducoes() {
        return reproducoes;
    }

    public void setReproducoes(int reproducoes) {
        this.reproducoes = reproducoes;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }  
}