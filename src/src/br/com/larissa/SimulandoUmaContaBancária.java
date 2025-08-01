package src.br.com.larissa;
import java.util.Scanner;

public class SimulandoUmaContaBancária {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner (System.in);

        int saldo = 10000;

        System.out.println("Olá! Sou sua assistente bancária virtual.");

        System.out.println("Para liberar o acesso, me diga o seu nome completo, por gentileza: ");
            String nome =  scanner.nextLine();

         System.out.println(nome + " o seu saldo disponível em sua conta é de: " + saldo);

    scanner.close();
    }
}
