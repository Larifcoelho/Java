package src.br.com.larissa;
import java.util.Scanner;

public class MenuComida {
    public static void main (String [] args){

        Scanner scanner = new Scanner (System.in);

        System.out.println("Escolha um prato do menu de 1 a 4: ");
        int dish = scanner.nextInt();

        switch (dish){
            case 1:
                System.out.println("Lasanha");
                break;
            case 2:
                System.out.println("Pizza");
                break;
            case 3:
                System.out.println("Salada");
                break;
            case 4:
                System.out.println("Sair do menu");
                break;
            default:
                System.out.println("Opção inválida");
                break;

        }
        scanner.close();
    }
}
