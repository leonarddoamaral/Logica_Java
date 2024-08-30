import javax.swing.JOptionPane;
public class VolumeSolidos {
    public static void main(String[] args) {
        double vol, raio, high, area;
        int pergunta;
        
        pergunta = Integer.parseInt(JOptionPane.showInputDialog("Qual volume voce deseja descobrir: digite 1 para esfera;2 para cilindro; 3 para cubo"));
        
        if (pergunta>=3){ 
            area= Double.parseDouble(JOptionPane.showInputDialog("Digite a area"));
            vol= area*area*area ;
            JOptionPane.showMessageDialog(null, "o volume é de"+ vol);
        }
        
        else if (pergunta>=2){
            raio=Double.parseDouble(JOptionPane.showInputDialog("Digite o raio"));
            high=Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
            vol= (raio*raio)*high*3.14;
            JOptionPane.showMessageDialog(null, "o volume é de"+ vol);
        }
        
        else {
           raio= Double.parseDouble(JOptionPane.showInputDialog("Digite o raio"));
           vol= ((raio*raio*raio)*12.56)/3;
           JOptionPane.showMessageDialog(null, "o volume é de"+ vol);
        }
        
