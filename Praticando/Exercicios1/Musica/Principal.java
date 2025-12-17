package Praticando.Exercicios1.Musica;

public class Principal {
    public static void main(String[] args) {
        Musica minhamusica = new Musica();
        minhamusica.setTitulo("Dancer in the Dark");
        minhamusica.setArtista("Chase Atlantic");
        minhamusica.setAnoDeLancamento(2017);
        minhamusica.fichaTecnica();
        minhamusica.avalia(8.5);
        minhamusica.avalia(9);
        minhamusica.avalia(8);
        minhamusica.avalia(10);
        minhamusica.avalia(10);
        minhamusica.avalia(9.5);
        System.out.println(String.format("Avaliações: %.1f", minhamusica.media()));
    }
}
