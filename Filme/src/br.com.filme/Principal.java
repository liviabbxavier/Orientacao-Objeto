import java.util.ArrayList;

import calculos.CalculadoraDeTempo;
import calculos.FiltroRecomendacao;
import modelos.Filme;
import modelos.Serie;
import modelos.Episodio;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme(); // a variável da direita cria uma referência 
        // construtor. Cria um novo objeto do tipo "Filme"
        meuFilme.setNome("From Hell");
        meuFilme.setAnoDeLancamento(2001);
        meuFilme.setDiretor("Albert e Allen Hughes");
        meuFilme.setDuracaoEmMinutos(122);

        // System.out.println(meuFilme); // Mostra a classe principal e o endereço onde se encontram os dados salvos
        // System.out.println(meuFilme.nome); imprime apenas o atributo destacado

        meuFilme.fichaTecnica();
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos() + " minutos");
        meuFilme.avalia(8);
        meuFilme.avalia(7);
        meuFilme.avalia(5);
        // System.out.println(meuFilme.getSomaDasAvaliacoes()); mostra a soma das avaliações
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes()); // caso não seja privado, não utiliza o get, puxa direto
        // concatenar: unir duas ou mais sequências de caracteres (strings) em uma única string.
        System.out.println(meuFilme.media() + "\n");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);
        System.out.println("\n");

        // Encapsulamento: (getters e setters) protege dados e métodos, controlando o acesso a eles e garantindo a integridade das informações.
        // meuFilme.somaDasAvaliacoes = 10; Manipula o valor da variável manualmente

        Serie minhaSerie = new Serie();
        minhaSerie.setNome("Brooklyn Nine-Nine");
        minhaSerie.setDiretor("Dan Goor");
        minhaSerie.setAnoDeLancamento(2013);
        minhaSerie.setTemporadas(8);
        minhaSerie.setEpisodiosPorTemporada(23);
        minhaSerie.setMinutosPorEpisodio(25);
        minhaSerie.fichaTecnica();
        System.out.println("Temporadas: " + minhaSerie.getTemporadas());
        System.out.println("Quantidade de episódios: " + minhaSerie.getEpisodiosPorTemporada());
        System.out.println("Duração de cada episódio: " + minhaSerie.getMinutosPorEpisodio() + " minutos");
        System.out.println("Duração para maratonar a série: " + minhaSerie.getDuracaoEmMinutos() + " minutos.\n");

        Filme meuFilme2 = new Filme(); // construtor. Cria um novo objeto do tipo "Filme"
        meuFilme2.setNome("Donzela");
        meuFilme2.setAnoDeLancamento(2024);
        meuFilme2.setDiretor("Juan Carlos Fresnadillo");
        meuFilme2.setDuracaoEmMinutos(109);
        System.out.println("\n");

        Episodio episódio = new Episodio();
        episódio.setNumero(1);
        episódio.setSuaSerie(minhaSerie);
        episódio.setTotalVisualizacoes(300);
        filtro.filtra(episódio);
        System.out.println("\n");

        // var filme = new Filme(); aqui o "var faz uma inferência(tipo de variável sem especificação)"
        Filme meuFilme3 = new Filme();
        meuFilme3.setNome("Thor");
        meuFilme3.setAnoDeLancamento(2011);
        meuFilme3.setDiretor("Kenneth Branagh");
        meuFilme3.setDuracaoEmMinutos(114);
        meuFilme3.avalia(7);
        System.out.println("\n");

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(meuFilme2);
        listaDeFilmes.add(meuFilme3);
        System.out.println("\n");

        System.out.println("Você tem " + listaDeFilmes.size() + " elementos na sua lista de filmes.\n");
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome() + "\n"); // pega o elemento que está na posição 1
        // a lista sempre começa apartir do zero(0)

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(meuFilme2);
        calculadora.inclui(minhaSerie);
        System.out.println(
                "Minutos dedicados para maratonar os itens na sua lista: " + calculadora.getTempoTotal() + "min.\n");
        System.out.println("Filmes inclusos na sua lista: " + listaDeFilmes.toString() + "\n");
    }
}