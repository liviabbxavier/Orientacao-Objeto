package Praticando.Exercicios1.Carro;

public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.setModelo("Clio");
        meuCarro.setCor("Branco");
        meuCarro.setAno(1997);
        meuCarro.fichaTecnica();
        System.out.println("Idade do carro: " + meuCarro.idadeDoCarro() + " anos.");
    }
}
