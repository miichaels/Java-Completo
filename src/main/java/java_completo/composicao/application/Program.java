package java_completo.composicao.application;

import java_completo.composicao.entities.Department;
import java_completo.composicao.entities.HourContract;
import java_completo.composicao.entities.Worker;
import java_completo.composicao.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com o nome do departamento: ");
        String departmentName = scanner.nextLine();

        System.out.println("Entre com os dados do trabalhador");
        System.out.print("Nome: ");
        String workerName = scanner.nextLine();

        System.out.print("Level: ");
        String workerLevel = scanner.nextLine();

        System.out.print("Base de salario: ");
        Double workerBaseSalary = scanner.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary, new Department(departmentName));

        System.out.println("Quantos contratos o trabalhor tera? ");
        int n = scanner.nextInt();

        for (int i = 1 ; i <= n; i++){
            System.out.println("Entre com o numero do contrato: " + i + "data:");
            System.out.print("Data (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(scanner.next());
            System.out.print("Valor por hora: ");
            double valuePerHour = scanner.nextDouble();
            System.out.print("Duração (hours): ");
            int hours = scanner.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);

        }

        System.out.println();
        System.out.print("Entre com o mes e ano para calcular salario (MM/YYYY): ");
        String monthAndYear = scanner.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartment().getName());
        System.out.println("Valor ganho no ano e mes informado: " + monthAndYear + ": " + String.format("%.2f" , worker.income(year, month)));

        scanner.close();
    }
}
