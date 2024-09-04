import javax.swing.JOptionPane;
public class mostraMaiorMestreSato {
    public static void main(String[] args) {
        float pNum,sNum;
        
        pNum= Float.parseFloat(JOptionPane.showInputDialog("Insira primeiro numero"));
        sNum= Float.parseFloat(JOptionPane.showInputDialog("Insira o segundo numero"));
        
        if(pNum>sNum){
            JOptionPane.showMessageDialog(null, "O maior numero é "+pNum);
        }
        
        else{
            JOptionPane.showMessageDialog(null,"O maior numero é "+sNum);
        }
    }
}
