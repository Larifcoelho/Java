package src.br.com.larissa;

import java.util.Scanner;

public class ValidaçãoSenhaWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "1234";
        String senhaDigitada = "";

        int maxTentativas = 3;
        int tentativas = 0;
        ;

        // enquanto a senha digitada for diferente da correta
        while (!senhaDigitada.equals(senhaCorreta) && tentativas < maxTentativas) {
            System.out.print("Você tem " + (maxTentativas - tentativas) + " tentativas. Digite sua senha: ");
            senhaDigitada = scanner.nextLine();

            if (!senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha incorreta. Tente novamente.");

            }
            if (senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Acesso permitido!");
            } else {
                System.out.println("Número máximo de tentativas excedido. Acesso negado!");
            }


            scanner.close();

        }
    }
}


