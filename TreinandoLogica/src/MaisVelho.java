import javax.swing.JOptionPane;
public class MaisVelho {
    public static void main(String[] args) {
        int maiorIdade=0;
        int menorIdade=Integer.MAX_VALUE;
        for(int i=0;i<101;i++){
            int idade=Integer.parseInt(JOptionPane.showInputDialog("Insira a idade"));
            if(idade>maiorIdade){
                maiorIdade=idade;
            }
            else if(idade<menorIdade){
                menorIdade=idade;
            }
        } 
        System.out.println("Mais velho"+maiorIdade);
        System.out.println("Mais Novo"+menorIdade);
    }
}
