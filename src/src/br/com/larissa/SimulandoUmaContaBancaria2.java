package src.br.com.larissa;
import java.util.Scanner;

public class SimulandoUmaContaBancaria2 {
    public static void main (String [] args) throws Exception {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Olá! Sou sua assistente bancária e irei ajudar você a criar uma conta.");

        System.out.println("Digite o seu nome completo: ");
        String name = scanner.nextLine();

        System.out.println("Qual a sua idade? ");
        int years = scanner.nextInt();

        if (years <= 0) {
            System.out.println("Idade inválido, digite a idade correta. ");
        } else if (years < 18) {
            System.out.println("Você é menor de idade, não pode realizar o cadastro");;
        }
            System.out.print("Qual o saldo que você quer inserir em sua conta? ");
            int value = scanner.nextInt();

        System.out.print(name + ", " + "sua conta foi criada com sucesso, com o saldo de: " + value ) ;



    }
}