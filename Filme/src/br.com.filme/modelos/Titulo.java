package modelos;

public class Titulo {
    // Atributos
    private String nome; // String é uma classe, não um tipo primitivo
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes; // Faz a soma das avaliações
    private int totalDeAvaliacoes; // Pega o número total de avaliações
    private int duracaoEmMinutos;
    private String diretor;

    // Modificadores de acesso: private e public
    // private exige o uso de getters e setters (ou só getters)
    // get: pega o valor
    // set: modifica ou atribui um valor
    // Para adicionar get e set no vscode: botão direito do mouse + source action + escolher a opção referente
    // sem o public, a classe não deixa a pessoa ver os atributos ou métodos
    
    public void fichaTecnica() { // Método
        System.out.println("Nome: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        System.out.println("Diretor: " + getDiretor());
    }

    public void avalia(double nota) { // Cria uma nova variável dentro do parâmetro
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double media() {
        return getSomaDasAvaliacoes() / getTotalDeAvaliacoes(); // Retorna a divisão das avaliações totais
    }
    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }
    
    public String getDiretor() {
        return diretor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    
}
