import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int n=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese uma lista de ids separados por ,:");
        String lista= sc.nextLine();
        Integer[] ids = new Integer[lista.split(",").length];
        for(int i=0; i<ids.length; i++){
            ids[i] = Integer.parseInt(lista.split(",")[i].trim());
        }
        System.out.println("Qual id deseja verificar?");
        String idVerificar = sc.nextLine();
        for(Integer id : ids){
            if(id.equals(Integer.parseInt(idVerificar))){
                System.out.println("Id encontrado: " + idVerificar);
                System.out.println("Posição do id na lista: " + n);
            }
            n++;
        }
        
    }
    
}