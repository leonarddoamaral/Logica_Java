import javax.swing.JOptionPane;
public class MediaAritmetica {
    public static void main(String[] args) {
        double num1,num2;
        num1= Double.parseDouble(JOptionPane.showInputDialog("Insira a primeira nota"));
        num2= Double.parseDouble(JOptionPane.showInputDialog("Insira a segunda nota"));
        if((num1+num2)/2 >= 6){
            JOptionPane.showMessageDialog(null,"Aprovado");
        }
        else{
            JOptionPane.showMessageDialog(null,"Reprovado");
        }
    }
}
