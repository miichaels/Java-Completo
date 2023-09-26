package java_completo;

import java.util.Locale;
import java.util.Scanner;

public class horasTrabalhadas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int num,horas;
        double valorHora, salario;

        System.out.println("Digite o seu codigo: ");
        num = scanner.nextInt();
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        horas = scanner.nextInt();

        System.out.println("Digite o valor da sua hora trabalhada: ");
        valorHora = scanner.nextDouble();

        salario = valorHora * horas;

        System.out.println("NUMERO = " + num);
        System.out.printf("SALARIO = U$ %.2f%n", salario);
    }
}
