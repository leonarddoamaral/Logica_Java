import java.util.Scanner;
public class Calculadora {
public static void main(String[] args) {
        float num1,num2, result;
        int operacao;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("num1 - ");
        num1 = sc.nextFloat();
        System.out.print("num2 - ");
        num2 = sc.nextFloat(); 
        
        System.out.println("Digite 1-Soma 2-Sub 3-Div 4-Mult :");
        operacao = sc.nextInt();

        if(operacao == 1)
        {
            result = num1 + num2;
            System.out.println("Resultado = "+ result);
        }
        else if(operacao == 2){
            result= num1 - num2;
            System.out.println("Resultado = "+result);
        }
        else if(operacao == 3){
            result= num1/num2;
            System.out.println("Resultado = "+result);
        }
        else if(operacao ==4 ){
            result = num1*num2;
            System.out.println("Resultado = "+result);
        }
        else
        {
            System.out.println("Operacao Invalida!!!");
        }
    }
}
