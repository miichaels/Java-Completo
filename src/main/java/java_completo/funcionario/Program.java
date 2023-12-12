package java_completo.funcionario;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Funcionario> list = new ArrayList<>();

        System.out.print("Qual a quantidade de funcionarios:  ");
        int n = scanner.nextInt();

        for (int i=1 ; i<=n; i++){
            System.out.println("Funcionario #" + i + " data:");
            System.out.println("Terceirizado (y/n)? ");
            char ch = scanner.next().charAt(0);

            System.out.print("Nome: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("Horas: ");
            int horas = scanner.nextInt();

            System.out.print("Valor por hora: ");
            double valorPorHora = scanner.nextDouble();

            if (ch == 'y'){
                System.out.print("Cobranca adicional: ");
                double additionalCharge = scanner.nextDouble();
                Funcionario emp = new FuncionarioTerceiro(name, horas, valorPorHora, additionalCharge);
                list.add(emp);


            }else {
                Funcionario emp = new Funcionario(name, horas, valorPorHora);
                list.add(emp);
            }

            System.out.println();
            System.out.println("PAYMENTS: ");
            for (Funcionario emp : list){
                System.out.println(emp.getNome() + " - $ " + String.format("%.2f", emp.pagamento()));
            }


        }


        scanner.close();

    }
}
