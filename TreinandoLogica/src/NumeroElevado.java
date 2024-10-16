import javax.swing.JOptionPane;
public class NumeroElevado {
    public static void main(String[] args) {
        double n= Double.parseDouble(JOptionPane.showInputDialog("insira o número"));
        int m = Integer.parseInt(JOptionPane.showInputDialog("insira o elevado"));
        double r=1;
        for(int i=1;i<=m;i++){
            r*=n;
            System.out.println(r);
        }
    }
}
