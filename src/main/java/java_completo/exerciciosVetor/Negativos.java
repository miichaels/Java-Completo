package java_completo.exerciciosVetor;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = scanner.nextInt();

        int[] vet = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vet[i] = scanner.nextInt();
        }

        System.out.print("Numeros negativos: ");
        for(int i = 0; i < n; i++){
            if (vet[i] < 0 ){
                System.out.println(vet[i]);
            }
        }
        scanner.close();

    }

}
