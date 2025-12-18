package Praticando.Exercicios1.Aluno;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Daniel");
        aluno.setIdade(15);
        aluno.exibeInformacoes();
        System.out.println("\n");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Mark");
        aluno2.setIdade(15);
        aluno2.exibeInformacoes();
        System.out.println("\n");

        Aluno aluno3 = new Aluno();
        aluno3.setNome("Izana");
        aluno3.setIdade(16);
        aluno3.exibeInformacoes();
        System.out.println("\n");
    }
}
