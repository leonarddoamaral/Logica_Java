import javax.swing.JOptionPane;
public class Multiplicando {
    public static void main(String[] args){

//o nome das variaveis vem das inicias de primeiro,segundo e terceiro, juntamente com a abreviação de "numero"

	float pNu, sNu,tNu, result;
        pNu= Float.parseFloat(JOptionPane.showInputDialog("Por favor, insira o primeiro número"));
        sNu= Float.parseFloat(JOptionPane.showInputDialog("Por favor, insira o segundo número"));
        tNu= Float.parseFloat(JOptionPane.showInputDialog("Por favor insira o terceiro número"));

//multiplicando os valores        
	result= pNu*sNu*tNu;

//mostrar resultado        
        JOptionPane.showMessageDialog(null, "a multiplicaçâo desses valores é de " + result); 
    }
    
}
