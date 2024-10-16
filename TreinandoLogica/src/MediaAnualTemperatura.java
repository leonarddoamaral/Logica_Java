import java.util.Scanner;
public class MediaAnualTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        int temp=0;
        int soma=0;
        do{
            System.out.println("Insira a temperatura");
            temp= sc.nextInt();
            i++;
            soma=+temp;
            
        }while(i<365);
        int media= soma/i;
        System.out.println("Media anual é de "+media);
    }
}
