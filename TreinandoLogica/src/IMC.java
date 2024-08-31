import javax.swing.JOptionPane;
public class IMC {
    public static void main(String[] args) {
        double peso,altura, imc;
        peso= Double.parseDouble(JOptionPane.showInputDialog("Informe o peso em kilos"));
        altura= Double.parseDouble(JOptionPane.showInputDialog("Informe a altura em metros"));
        imc= peso/(altura*altura);
        
        if (imc> 40){
            JOptionPane.showMessageDialog(null,"Obesidade grau III");
        }
        
        else if (imc>=35){
            JOptionPane.showMessageDialog(null,"Obesidade grau II");
        }
        
        else if (imc>=30){
            JOptionPane.showMessageDialog(null,"Obesidade grau I");
        }
        
        else if(imc>=25){
            JOptionPane.showMessageDialog(null,"Acima do peso");
        }
        
        else if (imc>=18.5){
            JOptionPane.showMessageDialog(null,"Peso normal");
        }
        
        else if (imc>=17){
            JOptionPane.showMessageDialog(null,"Abaixo do peso");
        }
        
        else {
            JOptionPane.showMessageDialog(null,"Muito abaixo do peso");
        }
    }
}
