package Praticando.Exercicios2.ContaBancaria;

import java.util.Scanner;

public class ContaBancaria {
    private int numConta = 123456;
    private double saldo = 20000;
    public String titular = "Maria";

    Scanner leitura = new Scanner(System.in);

    public void informacoes() {
        System.out.println("Digite o número da sua conta: ");
        int tentativa = leitura.nextInt();
        leitura.nextLine();

        while (tentativa != numConta) {
            System.out.println("Número incorreto, tente novamente.");
            tentativa = leitura.nextInt();
            leitura.nextLine();
        }

        System.out.println("Seja bem-vindo(a), " + titular);
        System.out.println("O saldo da conta " + getNumConta() + " é de R$ " + getSaldo());
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
