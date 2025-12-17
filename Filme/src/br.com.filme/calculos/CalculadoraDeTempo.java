package calculos;

import modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo t) {
        this.tempoTotal += t.getDuracaoEmMinutos();
    }

    // public void inclui(Filme f) {
    //    tempoTotal += f.getDuracaoEmMinutos();
    //}
    //public void inclui(Serie s) {
    //    tempoTotal += s.getDuracaoEmMinutos();
    //} métodos usados, mas não recomendados
}
