package java_completo.sobreposicao;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 1000.0);
        acc.withdraw(200.0);
        System.out.println(acc.getBalance());

        Account acc6 = new SavingsAccount(1001, "Amanda", 1000.0, 0.01);
        acc6.withdraw(200.0);
        System.out.println(acc6.getBalance());

        BussinesAccount bacc = new BussinesAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING - Criar o objeto de uma subclasse na super classe
        Account acc1 = bacc;
        Account acc2 = new BussinesAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);


        // DOWNCASTING - Converter um objeto da super classe para a subclasse


        BussinesAccount acc4 = (BussinesAccount) acc2;
        acc4.loan(100.0);

        //BussinesAccount acc5 = (BussinesAccount) acc3;
        if (acc3 instanceof BussinesAccount){
            BussinesAccount acc5 = (BussinesAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!! (Emprestimo");
        }

        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!!");
        }

        Account acc7 = new BussinesAccount(1003, "Bob", 1000.0, 500.0);
        acc7.withdraw(200.0);
        System.out.println(acc7.getBalance());


    }
}
