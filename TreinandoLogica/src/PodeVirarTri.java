import javax.swing.JOptionPane;
public class PodeVirarTri {
    public static void main(String[] args) {
        double a1,a2,a3;
        a1=Double.parseDouble(JOptionPane.showInputDialog("Digite a aresta 1"));
        a2=Double.parseDouble(JOptionPane.showInputDialog("Digite a aresta 2"));
        a3=Double.parseDouble(JOptionPane.showInputDialog("Digite a aresta 3"));
        if(a1<a2+a3 && a2<a1+a3 && a3<a2+a1){
            JOptionPane.showMessageDialog(null, "Vira um triângulo...");
            if(a1==a2 && a2==a3){
                JOptionPane.showMessageDialog(null, "Equilátero");
            }
            else if(a1==a2 || a2==a3 || a3==a1){
                JOptionPane.showMessageDialog(null, "Isósceles");
            }
            else{
                 JOptionPane.showMessageDialog(null, "Escaleno");
            }
        }
       
        else{
            JOptionPane.showMessageDialog(null, "Não vira um triângulo :( ");
        }
    }
}
