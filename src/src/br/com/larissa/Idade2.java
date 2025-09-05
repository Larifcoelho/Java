package src.br.com.larissa;
import java.util.Scanner;

public class Idade2 {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa: ");
        String nome1 = scanner.nextLine();

        System.out.println("Digite a idade da primeira pessoa: ");
        int idade1 = scanner.nextInt();
        scanner.nextLine(); // Limpa o "enter" que ficou no buffer

        System.out.println("Digite o nome da segunda pessoa: ");
        String nome2 = scanner.nextLine();

        System.out.println("Digite a idade da segunda pessoa: ");
        int idade2 = scanner.nextInt();

        int diferenca = Math.abs(idade1 - idade2);

        System.out.println(nome1 + " e " + nome2 +
                ", a diferença entre a idade de vocês é de: " + diferenca + " anos.");

        scanner.close();
    }
}
