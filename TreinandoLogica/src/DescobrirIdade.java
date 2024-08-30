import javax.swing.JOptionPane;
public class DescobrirIdade {
    public static void main(String[] args) {

//declarando as variaveis id= idade
	int anoNasc, anoAtual, id;
        anoNasc= Integer.parseInt(JOptionPane.showInputDialog("Insira o ano de nascimento"));
        anoAtual= Integer.parseInt(JOptionPane.showInputDialog("Em que ano estamos?"));
//operando os calculos        
        id= anoAtual-anoNasc;

//mostrando o resultado
        JOptionPane.showMessageDialog(null,"Sua idade é de "+ id +" anos");
    }
}