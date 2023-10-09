package java_completo.estoqueVetores;

import java.util.Locale;
import java.util.Scanner;

public class EstoqueVetores {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Produto[] vetor = new Produto[n];

        for (int i = 0; i < vetor.length; i++){
            scanner.nextLine();
            String nome = scanner.nextLine();
            double preco = scanner.nextDouble();
            vetor[i] = new Produto(nome,preco);
        }

        double soma = 0.0;
        for(int i = 0; i < vetor.length; i++){
            soma += vetor[i].getPreco();
        }

        double media = soma / vetor.length;

        System.out.printf("O preço médio é: %.2f%n", media );

        scanner.close();

    }
}
