package src.br.com.larissa;

public class SomaWHILE {
    public static void main (String [] args){

        int soma = 0;
        int n = 1;

        while (n <= 100){
            System.out.println(soma + "+" + n + "="+ (soma+n));
            soma+=n;
            n++;
        }
    }
}
