
import javax.swing.JOptionPane;
public class PrimosFor {
    public static void main(String[] args) {
        int i,num, num2, contador;
        contador=0;
        num= Integer.parseInt(JOptionPane.showInputDialog("Insira o número"));
        for (i = 1; i <= num; i++) {
            num2 = num%1;
            if(num2 ==0){
                contador++;
            }
        }
            if(contador>2){
                JOptionPane.showMessageDialog(null,"O número não é primo");
            }
            else{ 
                JOptionPane.showMessageDialog(null,"O numero é primo");
            }
    }
        
}