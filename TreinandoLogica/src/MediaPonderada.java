import javax.swing.JOptionPane;
public class MediaPonderada {
    public static void main(String[] args) {
        
//declarando as variaveis n=nota, mP= media ponderada
	double n1,n2,mP;
        n1= Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 1"));
        n2= Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 2"));
        
//operando os calculos
	mP= (2*n1+n2*3)/(5);
 
//mostrando resultados (como na formula da media ponderada os valores se somam, somei os pesos(2 e 3) para reduzir o código)
        
        JOptionPane.showMessageDialog(null,"A média ponderada dessas notas é " +mP);
        
    }
}
