package src.br.com.larissa;
import java.util.Scanner;

public class Retangulo {
    public static void main (String [] args){

        Scanner scanner = new Scanner (System.in);

        System.out.println ("Digite a base do retângulo: ");
        int base = scanner.nextInt();

        System.out.println("Digite a altura  do retângulo: ");
        int altura = scanner.nextInt();

        System.out.println("A área do retângulo equivale a: " + base * altura);

    }
}
