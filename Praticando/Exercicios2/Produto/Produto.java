package Praticando.Exercicios2.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;

    Scanner leitura = new Scanner(System.in);

    ArrayList<Produto> lista = new ArrayList<>();

    public void exibeProdutos() {
        Produto produto1 = new Produto();
        produto1.setNome("Headset");
        produto1.setPreco(299.90);

        Produto produto2 = new Produto();
        produto2.setNome("Jogo de panelas");
        produto2.setPreco(79.90);

        Produto produto3 = new Produto();
        produto3.setNome("Edredom");
        produto3.setPreco(59.90);

        lista.add(produto1);
        lista.add(produto2);
        lista.add(produto3);

        for (int i = 0; i < lista.size(); i++) {
            Produto p = lista.get(i);
            System.out.println((i + 1) + " - " + p.getNome() + " | R$ " + p.getPreco());
        }
    }

    public void aplicaDesconto() {
        System.out.println("Selecione o produto que você deseja aplicar o desconto...");

        for (int i = 0; i < lista.size(); i++) {
            Produto p = lista.get(i);
            System.out.println((i + 1) + " - " + p.getNome() + " | R$ " + p.getPreco());
        }

        int escolha = leitura.nextInt();
        leitura.nextLine();

        if (escolha < 1 || escolha > lista.size()) {
            System.out.println("Opção inválida.");
            return;
        }

        Produto selecionado = lista.get(escolha - 1);
        System.out.println("Digite o percentual de desconto (%): ");
        double percentual = leitura.nextDouble();

        double desconto = selecionado.getPreco() * (percentual / 100);
        double precoNovo = selecionado.getPreco() - desconto;
        selecionado.setPreco(precoNovo);

        System.out.println("Desconto aplicado com sucesso!");
        System.out.println("Preço novo de " + selecionado.getNome() + ": R$ " + precoNovo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
