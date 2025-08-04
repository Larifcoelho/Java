package src.br.com.larissa;
import java.util.Scanner;

public class OperaçõesMatemáticas {
    public static void main (String [] args){

    Scanner scanner = new Scanner (System.in) ;

    System.out.println("Olá! Para realizarmos a operação digite o primeiro número: ");
    int n1 = scanner.nextInt();

    System.out.println("Agora o segundo número: ");
    int n2 = scanner.nextInt();

    System.out.println("Agora escolha entre soma (1), subtração (2), multiplicação (3) ou (4) para sair: ");
    int chose = scanner.nextInt();

    int soma = n1 + n2;
        int sub = n1 - n2;
            int multi = n1 * n2;

    switch (chose){
        case 1:
            System.out.println("Você escolheu soma. O resultado é de: " + soma );
            break;
        case 2:
            System.out.println("Você escolheu subtração. O resultado é de: " +  sub);
            break;
        case 3:
            System.out.println("Você escolheu multiplicação. O resultado é de: " + multi);
            break;
        case 4:
            System.out.println("Obrigada pela atenção !");
            break;
        default:
            System.out.println("Opção inválida");
    }

    scanner.close();

    }
}
