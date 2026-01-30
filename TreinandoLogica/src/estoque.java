class ItemEstoque {
    String nome;
    int quantidade;

    ItemEstoque(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }
}

public List<String> gerarRelatorioReposicao(List<ItemEstoque> estoque) {
    List<String> pedidosDeReposicao = new ArrayList<>();
    
    for(ItemEstoque i : estoque){
        int quantidadeAtual = i.quantidade;
        if(quantidadeAtual==0){
            pedidosDeReposicao.add(i.nome);
        }
    }
    
    return pedidosDeReposicao;
}