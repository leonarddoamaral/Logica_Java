import javax.swing.JOptionPane;
public class LitrosPorKm {
    public static void main(String[] args) {
        
//declarando variaveis lKm= litros por kilometro
	double km,lKm, total;
        km= Double.parseDouble(JOptionPane.showInputDialog("Informe a  distância percorrida(em km)"));
        lKm= Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de litros colocados"));
        
//operando calculos
	total= km/lKm;

//mostrando resultados        
        JOptionPane.showMessageDialog(null,"Neste percurso são gastos "+ total +" litros por km ");
    }
    
}
