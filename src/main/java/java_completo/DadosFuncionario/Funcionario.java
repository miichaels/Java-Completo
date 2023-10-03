package java_completo.DadosFuncionario;

import java.util.Scanner;

public class Funcionario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DadosFuncionario funcionario = new DadosFuncionario();

        System.out.println("Digite seu nome: ");
        funcionario.nome = scanner.nextLine();

        System.out.println("Qual o seu salario bruto?");
        funcionario.salarioBruto = scanner.nextDouble();

        System.out.println("Quanto você paga de taxa?");
        funcionario.imposto = scanner.nextDouble();

        System.out.println();
        System.out.println("Funcionario: " + funcionario);

        System.out.println();
        System.out.println("Qual a porcentagem você deseja incrementar ao salario? ");
        double porcentagem = scanner.nextDouble();
        funcionario.aumentarSalario(porcentagem);

        System.out.println();
        System.out.println("Dados atualizados: " + funcionario);







    }

}
