public List<String> filtrarSenhasValidas(List<String> tentativas) {
    List<String> senhasBoas = new ArrayList<>();
    for(String s : tentativas){
        int tamanho = s.lenght();
        if(tamanho>=8){
            senhasBoas.add(s);
        }
    }
    return senhasBoas;
}