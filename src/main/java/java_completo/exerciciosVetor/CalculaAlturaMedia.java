package java_completo.exerciciosVetor;

import java.util.Scanner;

public class CalculaAlturaMedia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas? ");
        int n = scanner.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];



        for (int i = 0; i < n; i++){
            System.out.println("Dados da " + (i+1) + "a pessoa: ");
            System.out.print("Nome: ");
            nomes[i] = scanner.next();

            System.out.print("Idade: ");
            idades[i] = scanner.nextInt();

            System.out.print("Altura: ");
            alturas[i] = scanner.nextDouble();

        }

        double soma = 0;
        for (int i = 0; i < n; i++){
            soma = soma + alturas[i];
        }
        double mediaAlturas = soma / n;

        System.out.println();
        System.out.println("Altura media: " + mediaAlturas);

        int cont = 0;
        for (int i = 0; i < n; i++){
            if (idades[i] < 16){
                cont = cont + 1;
            }
        }

        double porcentagem = cont * 100.0 / n;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);

        for (int i = 0; i < n; i++){
            if (idades[i] < 16 ){
                System.out.println(nomes[i]);
            }
        }
        scanner.close();

    }

}
