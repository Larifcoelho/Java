package src.br.com.larissa;
import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main (String [] args){

        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite um número e diremos se é positivo ou negativo: ");
        int n = scanner.nextInt();

        if (n < 0 ){
            System.out.println("O número " + n +" é negativo");
        } else {
            System.out.println("O número " + n + " é positivo");
        }


        scanner.close();
    }
}

