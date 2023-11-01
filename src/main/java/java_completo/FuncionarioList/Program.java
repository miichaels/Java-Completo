package java_completo.FuncionarioList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Employee> list = new  ArrayList<>();

        System.out.println("Quantos funcionarios vão ser registrados?");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++){
            System.out.println("Employee #" + (i + 1) + ":" );
            System.out.print("Id: ");
            Integer id = scanner.nextInt();
            while(hasId(list, id)){
                System.out.print("Esse id ja existe! Tente novamente: ");
                id = scanner.nextInt();
            }

            System.out.print("Nome: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Salario: ");
            Double salary = scanner.nextDouble();

            Employee funcionario = new Employee(id, name, salary);

            list.add(funcionario);

        }

        System.out.println();
        System.out.print("Qual o id sera acrescentado o aumento de salario: ");
        int idSalary = scanner.nextInt();

        Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
       // Integer pos = position(list, idSalary);


        if (emp == null){
            System.out.println("Esse id não existe!");
        }else {
            System.out.println("Entre com a porcentagem: ");
            double percent = scanner.nextDouble();
            emp.increaseSalary(percent);
           // list.get(pos).increaseSalary(percent);
        }

        System.out.println();
        System.out.println("Lista de funcionarios: " );
        for (Employee e : list){
            System.out.println(e);
        }



        scanner.close();
    }

    public static Integer position(List<Employee> lista, int id){
        for( int i = 0; i < lista.size(); i++){
            if (lista.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }


    public static boolean hasId(List<Employee> list, int id){
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}
