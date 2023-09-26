package java_completo;

import java.util.Scanner;

public class exercicioFor1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ditige o numero da tabuada desejada.");
        int n = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            int mutiplicacao = i * n;
            System.out.println(i + " x " + n + " = " + mutiplicacao );
        }
    }
}
