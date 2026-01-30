class email{
    String nome;
    email(String nome){
        this.nome = nome;
    }
}

public List<email>limparEmails(List<email> emails){
    List<email> listaLimpa = new ArrayList<>();
    for(email atual : emails){
        if(!listaLimpa.contains(emails.get(i).nome)){
            listaLimpa.add(emails.get(i));
        }
    }
    return listaLimpa;
}