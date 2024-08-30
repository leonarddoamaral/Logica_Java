import javax.swing.JOptionPane;
public class Salario_Gratificacao {
    public static void main(String[] args) {

//declarando as variaveis o s=salario, imp=imposto, grat= gratificação 
	double sBase, imp, grat, sFim;
        sBase= Double.parseDouble(JOptionPane.showInputDialog("Insira o salário base"));
        grat= sBase*0.05;
        imp= (sBase+grat)*0.07;
        
        sFim= sBase+grat-imp;

//mostrando o resultado        
        JOptionPane.showMessageDialog(null, "A gratificaçâo é de " + grat);
        JOptionPane.showMessageDialog(null, "Imposto é de " + imp);
        JOptionPane.showMessageDialog(null, "Salário atual é de " + sFim);
    }
    
}
