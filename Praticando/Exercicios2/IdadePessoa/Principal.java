package Praticando.Exercicios2.IdadePessoa;

public class Principal {
    public static void main(String[] args) {
        IdadePessoa pessoa = new IdadePessoa();
        pessoa.setNome("Sae Itoshi");
        pessoa.setIdade(18);
        pessoa.dadosPessoa();
        pessoa.verificaIdade();

        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setNome("Seichiro Nagi");
        pessoa2.setIdade(17);
        pessoa2.dadosPessoa();
        pessoa2.verificaIdade();
    }
}
