package src.br.com.larissa;
import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do lado do quadrado para descobrir o valor da área dele: ");
        int quadradoL = scanner.nextInt();

        System.out.println("O resultado da área é: " + quadradoL * quadradoL);

        scanner.close();
    }
}