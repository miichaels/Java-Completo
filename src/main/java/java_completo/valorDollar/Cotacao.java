package java_completo.valorDollar;

import java_completo.membrosEstaticos.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Cotacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor do dollar? ");
        double c = Conversao.valorDollar = scanner.nextDouble();

        System.out.println("Quantos dollares você vai comprar? ");
        double v = Conversao.valorComprado = scanner.nextDouble();


        System.out.println("O valor convertido é de: " + Conversao.conversao() );
    }
}
