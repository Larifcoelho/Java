package src.br.com.larissa;

public class SomaFOR {
        public static void main (String [] args){

            int soma = 0;

            for (int n = 1; n <= 100; n++){
                System.out.println(soma + " + " + n + " = " + (soma + n));
                soma += n;
            }
            System.out.println("Soma total de 1 até 100 é: " + soma);
    }


}
