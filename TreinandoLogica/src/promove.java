class Funcionario {
    String nome;
    String cargo;
    double salario;

    Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
}

public void promoverEstagiarios(List<Funcionario> equipe) {
    for(Funcionario f : equipe){
        String cargoAtual = f.cargo();
        Double salarioAtual = f.salario();

        if(cargoAtual.equals("ESTAGIARIO")){
            f.cargo = "DESENVOLVEDOR JUNIOR";
            Double salarioNovo = salarioAtual*1.2;
            f.salario = salarioNovo;
        }
    }
}