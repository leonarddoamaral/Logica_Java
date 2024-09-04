/**
 *
 * @author Léo
 */
import javax.swing.JOptionPane;
public class quadrados {
public static void main(String[] args){
    //inserir numeros
    double primeiroNumero, segundoNumero, terceiroNumero, quartoNumero, quadrado1, quadrado2,quadrado3, quadrado4, soma;
    primeiroNumero=Double.parseDouble(JOptionPane.showInputDialog("Por Favor, insira o primeiro numero"));
    segundoNumero=Double.parseDouble(JOptionPane.showInputDialog("Por favor, insira o segundo numero"));
    terceiroNumero=Double.parseDouble(JOptionPane.showInputDialog("Por favor, insira o terceiro numero "));
    quartoNumero=Double.parseDouble(JOptionPane.showInputDialog("Por favor, insira o quarto numero"));
    //contas dos quadrados
    quadrado1= primeiroNumero*primeiroNumero;
    quadrado2=segundoNumero*segundoNumero;
    quadrado3=terceiroNumero*terceiroNumero;
    quadrado4=quartoNumero*quartoNumero;
    //soma
    soma= primeiroNumero+ segundoNumero+ terceiroNumero+ quartoNumero;
    //aparecer na tela;
    JOptionPane.showMessageDialog(null,"Quadrado do primeiro numero "+ quadrado1);
    JOptionPane.showMessageDialog(null,"Quadrado do segundo numero "+ quadrado2);
    JOptionPane.showMessageDialog(null,"Quadrado do terceiro numero "+ quadrado3);
    JOptionPane.showMessageDialog(null, "Quadrado do quarto numero "+ quadrado4);
    JOptionPane.showMessageDialog(null,"soma dos numeros inseridos"+ soma);
    
    
    
    }
       
}
