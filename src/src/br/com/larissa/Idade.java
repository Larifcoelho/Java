package src.br.com.larissa;
import java.util.Scanner;

public class Idade {
    public static void main (String [] args){

        Scanner scanner = new Scanner (System.in);
        System.out.print("Olá! Qual é o seu nome? ");
        String nome = scanner.nextLine();

        System.out.print("Em qual ano você nasceu? ");
        int anoDeNascimento = scanner.nextInt();

      int idade = 2025 - anoDeNascimento;

      System.out.println("Olá, " + nome + "! " + "Você tem"  + " " + idade + " anos!" );

      scanner.close();
    }
}
