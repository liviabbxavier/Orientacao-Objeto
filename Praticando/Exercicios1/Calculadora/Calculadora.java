package Praticando.Exercicios1.Calculadora;

import java.util.Scanner;

public class Calculadora {
    int numero;

    Scanner leitura = new Scanner(System.in);

    public void voltaDobro() {
        System.out.println("Digite um número para ver o dobro dele...");
        numero = leitura.nextInt();
        leitura.nextLine();

        int resultado = numero * 2;

        System.out.println("O dorbo de " + numero + " é: " + resultado);
    }
}
