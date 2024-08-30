import javax.swing.JOptionPane;
public class Area_Circulo {
    public static void main(String[] args) {
        
//declarando variaveis
	double raio,area;
        raio= Double.parseDouble(JOptionPane.showInputDialog("Insira o raio")); 
        
//operando calculos
	area= 3.14*(raio*raio);

//mostrando resultados
        JOptionPane.showMessageDialog(null,"A área total é de " + area);
    }
}
