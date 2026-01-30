class Produto {
    String nome;
    double preco;
    String categoria;

    Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }
}

public double calcularTotalEletronicos(List<Produto> lista) {
    Double total = 0.0;
    Double precoAtual;
    String categoriaAtual;

    for(Produto p : lista){
        categoriaAtual = p.categoria;
        precoAtual = p.preco;
        if(categoriaAtual.equals("ELETRONICOS")){
            total+=precoAtual;
        }
    }

    return total;
}