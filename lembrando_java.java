
import javax.swing.JOptionPane;

public class lembrando_java {
    public static void main(String args[]) {
        String nome = JOptionPane.showInputDialog("Insira seu nome");
        String resposta;
        int idade ;
        int nota;
        System.out.println("seu nome é " + nome);
        idade= Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade"));
        if (idade < 18) {
            System.out.println("Ops você é de menor");
        } else {
            System.out.println("Sua idade é " + idade);
            System.out.println("Cadastro Completo");
            System.out.println("Bem vindo a sua jornada matematica");
            double[] resultados = new double[3];
            resultados[0] = 10.5;
            resultados[1] = -0.5;
            resultados[2] = -1;
            resposta = JOptionPane.showInputDialog("calcule: (2*4+1*(1-15))/12= x\nA)" + resultados[0] +"\n" +"B)"+ resultados[1]+"\n"+"C)" + resultados[2]);
            if(resposta=="b" || resposta=="B" || resposta==" b"){
                System.out.println("Certo");
                nota=10;
            };         

        }
        System.out.println("______Relatorio______");
        System.out.println("| Nome | Idade | Nota |");
        System.out.println("| "+nome+" | "+idade+" | "+nota+" |");

    }
}
