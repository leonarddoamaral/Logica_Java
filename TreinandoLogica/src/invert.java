public List<Integer> filtrarEReverter(List<Integer> numeros) {
    List<filtrarEReverter> flitrado = new ArrayList<>();
    for(Integer atual : numeros){
        if(filtrarEReverter.get(atual)>0){
            filtrado.add(filtrarEReverter.get(atual));
        }
    }

    filtrado.Collections.reverse();

    return filtrado;
    // 1. Criar a nova lista
    // 2. Loop para filtrar os positivos
    // 3. Loop ou método para inverter (Dica: Collections.reverse() ou loop decrescente)
}