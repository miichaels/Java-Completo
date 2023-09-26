package java_completo;

import java.util.Scanner;

public class whileT {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para fechar o jogo");
        int x = scanner.nextInt();
        int soma = 0;

        while (x != 0){
            soma += x;
            x = scanner.nextInt();
        }

        System.out.println("Parabéns você conseguiu!!");
        System.out.println("A soma dos numeros é de " + soma);
    }

}
