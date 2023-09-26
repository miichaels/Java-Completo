package java_completo;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b,soma;


        System.out.println("Digite dois numeros para serem somados.");
        System.out.println("Digite o primeiro numero: ");
        a = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        b = scanner.nextInt();

        soma = a + b;
        System.out.println("A soma total: " + soma);



    }
}
