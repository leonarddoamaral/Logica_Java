import javax.swing.JOptionPane;
public class Conversor {
    public static void main(String[] args) {
//declarando as variaveis        
        double dolar,euro, yuan, iene, real, conversao;
        int pergunta1, pergunta2;
//Mensagem de intorducacao
        JOptionPane.showMessageDialog(null,"Bem-vindo(a) ao nosso conversor de moedas!!");
//primeira pergunta para escolher qual moeada sera usada        
        pergunta1= Integer.parseInt(JOptionPane.showInputDialog("Primeiro, escolha a moeda que deseja converter: digite 1 para DÓLAR, 2 para EURO, 3 para YUAN, 4 para IENE e 5 para REAL."));
//a moeda escolhida foi o DOLAR entao todos os processos serao do DOLAR para OUTRA MOEDA        
        if (pergunta1==1){
            pergunta2= Integer.parseInt(JOptionPane.showInputDialog("Para qual moeda? 2 para EURO, 3 para YUAN, 4 para IENE, 5 para REAL "));

            if (pergunta2 ==2){
                dolar= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor em dólar"));
                conversao = dolar*0.9;

                JOptionPane.showMessageDialog(null,conversao+"euros ");

            }

            else if (pergunta2==3){
                dolar= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor em dólar"));
                conversao = dolar*7.12;

                JOptionPane.showMessageDialog(null,conversao+"Yuan chinês ");
            }

            else if (pergunta2==4) {
                dolar= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor em dolar"));
                conversao= dolar*146.89;

                JOptionPane.showMessageDialog(null, conversao+"Iene Japonês");
            }

            else if (pergunta2==5){
                dolar= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor em dólar"));
                conversao= dolar*5.61;

                JOptionPane.showMessageDialog(null, conversao+"Reais");
            }
        }
//a moeda escolhida foi o EURO entao todos os processos serao do EURO para OUTRAS MOEDAS
        else if(pergunta1==2){
            pergunta2= Integer.parseInt(JOptionPane.showInputDialog("Para qual moeda. 1 para DÓLAR, 3 para YUAN, 4 para IENE, 5 para REAL"));

            if (pergunta2==1){
                euro= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor em euro"));
                conversao= euro*1.11;

                JOptionPane.showMessageDialog(null, conversao+"dólar");
            }

            else if (pergunta2==3){
                euro= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor em euro"));
                conversao= euro*7.88;

                JOptionPane.showMessageDialog(null, conversao+"Yuan chinês");
            }

            else if (pergunta2==4){
                euro= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor em euro"));
                conversao= euro*162.65;

                JOptionPane.showMessageDialog(null, conversao+"Iene Japonês");  
            }

            else if(pergunta2==5){
                euro= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor em euro"));
                conversao= euro*6.21;

                JOptionPane.showMessageDialog(null, conversao+"Reais");
            }
        }
//moeda escolhida foi o YUAN entao todos os processos serao do YUAN para OUTRA MOEDA               
        else if(pergunta1==3){
            pergunta2= Integer.parseInt(JOptionPane.showInputDialog("Para qual moeda. 1 para DÓLAR, 2 para EURO, 4 para IENE, 5 para REAL"));

            if (pergunta2==1){
                yuan= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor em yuan"));
                conversao= yuan*0.14;

                JOptionPane.showMessageDialog(null, conversao+"dólar");
            }

            else if (pergunta2==2){
                yuan= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor em yuan"));
                conversao= yuan*0.13;

                JOptionPane.showMessageDialog(null, conversao+"euro");
            }

            else if (pergunta2==4){
                yuan= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor em yuan"));
                conversao= yuan*20.64;

                JOptionPane.showMessageDialog(null, conversao+"Iene Japonês");  
            }

            else if(pergunta2==5){
                yuan= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor em yuan"));
                conversao= yuan*0.79;

                JOptionPane.showMessageDialog(null, conversao+"Reais");
            }
        }
//a moeda escolhida foi o IENE entao todos os processos serao do IENE para OUTRA MOEDA
        else if(pergunta1==4){
            pergunta2= Integer.parseInt(JOptionPane.showInputDialog("Para qual moeda. 1 para DÓLAR, 2 para EUROS, 3 para YUAN, 5 para REAL"));

            if (pergunta2==1){
                iene= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor em iene"));
                conversao= iene*0.0068;

                JOptionPane.showMessageDialog(null, conversao+"dólar");
            }

            else if (pergunta2==2){
                iene= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor em iene"));
                conversao= iene*0.0062;

                JOptionPane.showMessageDialog(null, conversao+"euro");
            }

            else if (pergunta2==3){
                iene= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor em iene"));
                conversao= iene*0.048;

                JOptionPane.showMessageDialog(null, conversao+"Yuan chinês");  
            }

            else if(pergunta2==5){
                iene= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor em iene"));
                conversao= iene*0.038;

                JOptionPane.showMessageDialog(null, conversao+"Reais");
            }
        }
                     
// a moeda escolhida foi o REAL entao todos os processos serao do REAL para OUTRA MOEDA
        else if(pergunta1==5){
                pergunta2= Integer.parseInt(JOptionPane.showInputDialog("Para qual moeda. 1 para DÓLAR, 2 para EURO, 3 para YUAN, 4 para IENE"));
                
            if (pergunta2==1){
                real= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor em reias"));
                conversao= real*0.18;

                JOptionPane.showMessageDialog(null, conversao+"dólar");
            }

            else if (pergunta2==2){
                real= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor em reias"));
                conversao= real*0.16;

                JOptionPane.showMessageDialog(null, conversao+"euro");
            }

            else if (pergunta2==3){
                real= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor em reais"));
                conversao= real*1.27;

                JOptionPane.showMessageDialog(null, conversao+"Yuan chinês");  
            }
                    
            else if (pergunta2==4){
                real= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor em reais"));
                conversao= real*26.16;
                        
                JOptionPane.showMessageDialog(null, conversao+"Iene Japonês");
     
            }
        } 
    }
}
