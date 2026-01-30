class estoque{
    String produto;
    estoque(String produto){
        this.produto = produto;
    }
}

public List<estoque>processarEstoque(List<estoque> lista){
    List<estoque> alteracao = new ArrayList<>();

    alteracao.add(0,"Teclado Mechanical");

    if(!alteracao.isEmpty()){
        alteracao.remove(alteracao.size()-1);
    }

    if(alteracao.contains("Mouse")){
        System.out.println("Produto em falta");
    }
    else{
        alteracao.add("Mouse");
    }

    return alteracao;
}

