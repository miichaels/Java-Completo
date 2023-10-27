package java_completo.exerciciosVetor.pensionato;

import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aluguel[] vect = new Aluguel[10];

        System.out.println("Quantos quartos serão alugados?");
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println();
            System.out.println("Quarto " + i + ":");
            System.out.print("Nome: ");
            scanner.nextLine();

            String nome = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.next();
            System.out.print("Quarto: ");
            int numeroQuarto = scanner.nextInt();

            vect[numeroQuarto] =  new Aluguel(nome, email);
        }

        System.out.println();
        System.out.println("Quartos Alugados");
        System.out.println();
            for (int i = 0; i < 10; i++) {
                if (vect[i] != null){
                    System.out.println(i + ": " + vect[i]);
                }
            }

    }
}
