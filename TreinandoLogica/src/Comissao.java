import javax.swing.JOptionPane;
public class Comissao {   
    public static void main(String[] args) {
        
//declarando as variaveis s= salario, n= numero
	double sFixo, nVendas, comissao, result;
        sFixo= Double.parseDouble(JOptionPane.showInputDialog("Insira o salário fixo"));
        nVendas= Double.parseDouble(JOptionPane.showInputDialog("insira o número de vendas"));

//operando os calculos        
        comissao= (sFixo*0.04)*nVendas;
        result = comissao+sFixo;
        
//mostrando os resultados
        JOptionPane.showMessageDialog(null," A comissão é de "+ comissao);
        JOptionPane.showMessageDialog(null," O salário final é de "+ result);
    }
}
