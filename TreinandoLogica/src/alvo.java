public int contarAcessos(List<String> usuarios, String alvo){
    for(String item: usuarios){
        if(usuarios(item).equals(alvo)){
            contarAcessos++;
        }
        return contarAcessos;
    }
}