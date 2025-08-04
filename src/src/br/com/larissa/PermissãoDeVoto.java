package src.br.com.larissa;
import java.util.Scanner;

public class PermissãoDeVoto {
    public static void main (String [] args){

        Scanner scanner = new Scanner (System.in);

        System.out.println("Olá! Digite sua idade: ");
        int years = scanner.nextInt();

        if (years <= 16 ){
            System.out.println("Não pode votar. ");
        } else if ((years >= 16 && years < 18) || years >= 70) {
            System.out.println("Voto opcional.");
        } else {
            System.out.println("Voto obrigatório.");
        }

        scanner.close();
    }
}
