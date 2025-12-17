public class MinhasPreferidas {
    
    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é o preferido de todos.");
        } else {
            System.out.println(audio.getTitulo() + " é uma excelente escolha, adicione à uma playlist para assistir mais tarde.");
        }
    }
}