import javax.swing.JOptionPane;
public class SenhaWhile{
    public static void main(String[] args) {
        int contador, senha, leitura;
        senha= 54321;
        leitura= 0;
        contador= 2;
        leitura= Integer.parseInt(JOptionPane.showInputDialog("Insira a senha"));
            if (leitura!=senha){
                while(contador<=3){
                    JOptionPane.showMessageDialog(null,"Acesso negado");
                    leitura= Integer.parseInt(JOptionPane.showInputDialog("Insira a senha novamente"));
                    contador= contador+1;
                }
                JOptionPane.showMessageDialog(null,"Acesso Negado, falar com ADM");
            }
            
            else{
                JOptionPane.showMessageDialog(null,"Bem vindo");
        }
    }       
    
}