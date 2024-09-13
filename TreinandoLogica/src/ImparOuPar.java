import javax.swing.JOptionPane;
public class ImparOuPar {
    public static void main(String[] args) {
        int num;
        num= Integer.parseInt(JOptionPane.showInputDialog("Digite um número para descubrir se ele é ÍMPAR ou PAR"));
        if(num%2==0){
            JOptionPane.showMessageDialog(null,"PAR!!");
        }
        else{
            JOptionPane.showMessageDialog(null,"ÍMPAR!!");
        }
    }
}
