import javax.swing.JOptionPane;
public class Fatorial {
    public static void main(String[] args) {
        int numero,contador,fat,result;
        numero= Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        fat=1;
        result=1;
        for(contador=1;contador<=numero; contador++){
            System.out.println(result);
            fat=fat+1;
            result=result*(fat);
        }
    }        
}
    
