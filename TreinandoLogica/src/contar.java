public int contarPrecosIguais(List<Double> precos, Double precoAlvo) {
    int contador=0;
    for(Double p : precos){
        if(p.equals(precoAlvo)){
            contador++;
        }
    }
    return contador;
}