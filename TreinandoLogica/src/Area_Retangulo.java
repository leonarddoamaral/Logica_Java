import javax.swing.JOptionPane;
public class Area_Retangulo {
    public static void main(String[] args) {
       
//declarando as variaveis r=retangulo
	 double rBase, rAltura, area;
        rBase= Double.parseDouble(JOptionPane.showInputDialog("Insira o tamanho da base")); 
        rAltura= Double.parseDouble(JOptionPane.showInputDialog("Insira o tamanho da altura"));
        
//operando calculos
	area= rBase*rAltura;
        
//mostrando resultados
	JOptionPane.showMessageDialog(null,"A área total é de " + area);
    }
}