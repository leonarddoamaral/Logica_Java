class Cliente {
    String nome;
    String cidade;

    Cliente(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }
}

class Pedido {
    int id;
    Cliente cliente; // Composição: o objeto Cliente está aqui dentro
    double valor;

    Pedido(int id, Cliente cliente, double valor) {
        this.id = id;
        this.cliente = cliente;
        this.valor = valor;
    }
}

public List<Integer> filtrarPedidosPorCidade(List<Pedido> listaPedidos, String cidadeAlvo) {
    List<Integer> idsEncontrados = new ArrayList<>();
    int contador = 0;
    for(Pedido obj : listaPedidos){
        String cidadeAtual = obj.cliente.cidade;
        if(cidadeAlvo.equals(cidadeAtual)){
            idsEncontrados.add(obj.id);
        }

    }

    return idsEncontrados;
}