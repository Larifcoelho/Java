package src.br.com.larissa;
import java.util.Scanner;

public class IMC {
    public static void main (String [] args){

        Scanner scanner = new Scanner (System.in);
        System.out.println("Quer descobrir seu IMC? Digite sua altura e seu peso nos campos abaixo: ");

        System.out.println("Altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        if (imc <= 18.5){
            System.out.println("Abaixo do peso. Atenção! ");
        } else if (imc >= 18.5 && imc <25){
            System.out.println("Parabéns! Peso normal.");
        }else if (imc>= 25 && imc <30){
            System.out.println("Levemente acima do peso. ");
        }else if(imc >= 30 && imc <35){
            System.out.println("Obesidade Grau I.");
        }else if (imc >= 35 && imc < 40){
            System.out.println("Obesidade Grau II (SEVERA).");
        }else
            System.out.println("Obesidade III (MÓRBIDA). Atenção!");
        }
    }

