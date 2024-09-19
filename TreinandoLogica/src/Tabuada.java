import javax.swing.JOptionPane;
public class Tabuada {
    public static void main(String[] args) {
        int tab;
        tab= Integer.parseInt(JOptionPane.showInputDialog("Insira um numero e veja sua tabuada"));
        for(int i=0;i<=10;i=i+2){
            System.out.println(tab+"x"+i+"="+(i*tab));
        }
    }
}
