class Avaliacao {
    double nota;
    int peso;
    
    Avaliacao(double nota, int peso) {
        this.nota = nota;
        this.peso = peso;
    }
}

public double calcularMediaPonderada(List<Avaliacao> avaliacoes) {
    // Dica: você precisará de duas variáveis (somaNotas e somaPesos)
    Double media,somaNotas,somaPesos;
    for(Avaliacao avalia: avaliacoes){
        somaPesos += peso;
        somaNotas += (nota*peso);
    }
    media = somaNotas/somaPesos;
    return media;
}