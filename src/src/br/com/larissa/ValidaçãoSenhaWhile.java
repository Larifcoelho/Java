package src.br.com.larissa;

import java.util.Scanner;

public class ValidaçãoSenhaWhile {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "1234";
        String senhaDigitada = "";

        // enquanto a senha digitada for diferente da correta
        while (!senhaDigitada.equals(senhaCorreta)) {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextLine();

            if (!senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha incorreta. Tente novamente.");
        }
    }

        System.out.println("Acesso permitido!");
        scanner.close();
    }
}
