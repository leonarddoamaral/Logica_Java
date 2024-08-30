import javax.swing.JOptionPane;
public class Aumento_Salario {
    public static void main(String[] args){

//declarando as variaveis utilizando resumidas sIn é salario inicial sFinal é salario fianl
	double sIn,sFinal;
        sIn= Double.parseDouble(JOptionPane.showInputDialog(" insira o salário inicial "));

//operando o calculo
        sFinal= sIn+sIn*0.25;

//mostrando o resultado        
        JOptionPane.showMessageDialog(null, "Salário atual é de " + sFinal);
                }
}