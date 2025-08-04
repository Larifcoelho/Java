package src.br.com.larissa;
import java.util.Scanner;

public class Tabuada2 {
    public static void main (String [] args){

        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite um número e iremos mostrar a tabuada dele: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= 50; i++ ){
            System.out.println(n + " x "+ i+ " = " +i*n);
        }
        scanner.close();
    }
}
