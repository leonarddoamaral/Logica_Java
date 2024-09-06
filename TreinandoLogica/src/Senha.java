import javax.swing.JOptionPane;
public class Senha {
    public static void main(String[] args) {
        int contador, senha, leitura;
        senha= 54321;
        leitura= 0;
        contador= 0;
        leitura= Integer.parseInt(JOptionPane.showInputDialog("Insira a senha"));
        if (leitura!=senha){
            JOptionPane.showMessageDialog(null,"Acesso negado");
        }
        
        else{
            JOptionPane.showMessageDialog(null,"Acesso Permitido");
        }
    }
}
