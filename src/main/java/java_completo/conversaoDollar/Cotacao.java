package java_completo.conversaoDollar;

import java.util.Locale;
import java.util.Scanner;

public class Cotacao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor do dollar? ");
        Conversao.valorDollar = scanner.nextDouble();

        System.out.println("Quantos dollares vocÃª vai comprar? ");
        Conversao.valorComprado = scanner.nextDouble();

        System.out.println("O valor convertido Ã© de: " + Conversao.conversao());
    }
}
