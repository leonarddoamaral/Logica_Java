import javax.swing.JOptionPane;
public class Area_Triangulo {
    public static void main(String[] args) {
        
//declarando variaveis t= triangulo
	double tBase, tAltura, area;
        tBase= Double.parseDouble(JOptionPane.showInputDialog("Insira o tamanho da base")); 
        tAltura= Double.parseDouble(JOptionPane.showInputDialog("Insira o tamanho da altura"));
        
//operando calculos
	area= (tBase*tAltura)/2;

//mostrando resultados
        JOptionPane.showMessageDialog(null,"A área total é de " + area);
    }
}