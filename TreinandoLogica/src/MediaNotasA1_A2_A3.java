import javax.swing.JOptionPane;
public class MediaNotasA1_A2_A3 {
    public static void main(String[] args){

//declarando as variaveis
	float a1, a2, a3, mult1, mult2, mult3, mN;
        a1= Float.parseFloat(JOptionPane.showInputDialog("inserir nota A1 "));
        a2= Float.parseFloat(JOptionPane.showInputDialog("inserir nota A2 "));
        a3= Float.parseFloat(JOptionPane.showInputDialog("inserir nota A3 "));

//dando peso a cada variavel        
       mult1= a1*3;
       mult2= a2*3;
       mult3= a3*4;

//fazendo a media das notas conforme os seus pesos     
       mN= (mult1+mult2+mult3)/10;

//mostrando o resultado
       JOptionPane.showMessageDialog(null, "a media do aluno é de " + mN);
     
    }
    
}
