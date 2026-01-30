public void aplicarDesconto(List<Double> precos) {
    Double novoPreco, precoAtual;
    for(int i=0; i< precos.size();i++){
        precoAtual = precos.get(i);
        if(precoAtual>100.0){
            novoPreco = precoAtual*0.9;
            precos.set(i, novoPreco);
        }
    }
}