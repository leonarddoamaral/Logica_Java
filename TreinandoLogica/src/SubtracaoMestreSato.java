import javax.swing.JOptionPane;
public class SubtracaoMestreSato {
    public static void main(String[] args) {
        int pNum,sNum, r;
        
        pNum= Integer.parseInt(JOptionPane.showInputDialog(" Insira o primeiro numero"));
        sNum= Integer.parseInt(JOptionPane.showInputDialog(" Insira o segundo numero"));
        
        if (pNum> sNum){
            r= pNum-sNum;
        }
        
        else {
            r= sNum-pNum;
        }
        
        JOptionPane.showMessageDialog(null,"resultado é "+ r );
    }
    
}
