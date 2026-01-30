class avalia{
    Double notas;
    avalia(Double notas){
        this.notas = notas;
    }
}

public List<avalia>avaliarNotas(List<avalia> lista){
    List<avalia> melhores = new ArrayList<>()
    Double n=0;
    for(int i = 0; i<lista.size();i++){
        n = n+lista.get(i).notas;
    }
    
    Double media = (lista.size() > 0) ? soma / lista.size() : 0.0;

    for(int i = 0; i < lista.size();i++){
        if(lista.get(i).notas >= 7.0){
            melhores.add(lista.get(i));
        }
    }

    return melhores;
}