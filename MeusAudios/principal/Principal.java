public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Sugar Rush Ride");
        minhaMusica.setArtista("TXT");
        minhaMusica.setAlbum("Chapter: TEMPTATION");
        minhaMusica.setDuracao(3.6);
        minhaMusica.setGenero("K-pop");

        for (int i = 0; i < 10000; i++) { // adiciona o número de reproduções
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 50000; i++) { // adiciona a quantidade de curtidas
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 5000; i++) { // adiciona o número de reproduções
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 1000; i++) { // adiciona a quantidade de curtidas
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
