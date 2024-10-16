import java.util.Scanner;
public class RaizNumNatural {
    public static void main(String[] args) {
        int num,r;
        System.out.println("Insira um numero");
        Scanner sc = new Scanner(System.in);
        num =sc.nextInt();
        r=1;
        
        while(num>=(r*r)){
            r++;
        }
        if(num>r){
            r--;
        }
        System.out.println("O número natural que mais se aproxima de raiz de "+num+", sem ultrapassar, é "+r);
    }
}
