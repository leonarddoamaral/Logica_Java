import javax.swing.JOptionPane;
public class PesoIdeal {
    public static void main(String[] args) {
        double h,r;
        int sx;
        sx= Integer.parseInt(JOptionPane.showInputDialog("insira o sexo 0=homem 1=mulher"));
        h= Double.parseDouble(JOptionPane.showInputDialog("Insira a altura"));
        if(sx>0 && sx<2){
            r= 72.7*h-58;
            JOptionPane.showMessageDialog(null,"Peso ideal é "+r);
        }
        else{
            r= 62.1*h-44.7;
            JOptionPane.showMessageDialog(null,"Peso ideal é "+r);
        }
    }
}
