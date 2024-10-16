import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        int num,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número que deseja ver a tabuada");
        num = sc.nextInt();
        for(int i =1; i<11;i++){
            r=num*i;
            System.out.println(r);
        }
    }
}

