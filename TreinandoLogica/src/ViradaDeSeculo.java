import javax.swing.JOptionPane;
public class ViradaDeSeculo {
    public static void main(String[] args) {
        
//declarando variaveis id=idade sub= subtração
	int id, ano, sub,result;
        
        id= Integer.parseInt(JOptionPane.showInputDialog("Insira a sua idade atual"));
        ano= Integer.parseInt(JOptionPane.showInputDialog("Em que ano estamos?"));
        
//operando calculos
	sub= 2100-ano;
        result=sub+id;
         
//mostrando resultados      
         JOptionPane.showMessageDialog(null,"Na proxima virada de seculo voce tera "+ result +" anos ");
    }
    
}
