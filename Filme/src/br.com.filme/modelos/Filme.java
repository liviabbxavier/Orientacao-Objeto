package modelos;

import calculos.Classificavel;

public class Filme extends Titulo implements Classificavel{// Tipo de referência
    // extends faz a herança e só pode ser usado uma vez
    
    @Override
    public int getClassificacao() {
        return (int) media() / 2; // é obrigatório o uso de cast neste caso pois irá retornar como um número inteiro
    }

    @Override
    public String toString() {
        return "\nNome: " + this.getNome() +"(" + getAnoDeLancamento() + ").\n";
    }
}