package Praticando.Exercicios2.IdadePessoa;

public class IdadePessoa {
    private String nome;
    private int idade;

    public void dadosPessoa() {
        System.out.println("\nNome: " + getNome());
        System.out.println("Idade: " + getIdade());
    }

    public void verificaIdade() {
        if (getIdade() >= 18) {
            System.out.println(getNome() + " é maior de idade.");
        } else {
            System.out.println(getNome() + " é menor de idade.");
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    
}
