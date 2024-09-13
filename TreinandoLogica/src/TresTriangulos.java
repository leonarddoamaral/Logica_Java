import javax.swing.JOptionPane;
public class TresTriangulos {
    public static void main(String[] args) {
        double b1,b2,b3,a1,a2,a3,r1,r2,r3;
        b1= Double.parseDouble(JOptionPane.showInputDialog("Insira primeira base"));
        a1= Double.parseDouble(JOptionPane.showInputDialog("Insira primeira area"));
        b2= Double.parseDouble(JOptionPane.showInputDialog("Insira segunda base"));
        a2= Double.parseDouble(JOptionPane.showInputDialog("Insira segunda area"));
        b3= Double.parseDouble(JOptionPane.showInputDialog("Insira terceira base"));
        a3= Double.parseDouble(JOptionPane.showInputDialog("Insira terceira area"));
        r1=(b1*a1)/2;
        r2=(b2*a2)/2;
        r3=(b3*a3)/2;
        if(r1>r2 && r1>r3){
            JOptionPane.showMessageDialog(null,"A maior area é a primeira "+r1);
        }
        else if(r2>r1 && r2>r3){
            JOptionPane.showMessageDialog(null,"A maior area é a segunda "+r2);
        }
        else{
            JOptionPane.showMessageDialog(null,"A maior area é a terceira "+r3);
        }
    }
}
