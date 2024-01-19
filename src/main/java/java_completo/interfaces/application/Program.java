package java_completo.interfaces.application;

import java_completo.interfaces.entities.CarRental;
import java_completo.interfaces.entities.Vehicle;
import java_completo.interfaces.model.services.BrazilTaxService;
import java_completo.interfaces.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");

        System.out.print("Modelo do carro: ");
        String carModel = scanner.nextLine();

        System.out.print("Retirada (dd/MM/yyyy hh.mm): ");
        LocalDateTime start = LocalDateTime.parse(scanner.nextLine(), fmt);

        System.out.print("Retorno (dd/MM/yyyy hh.mm): ");
        LocalDateTime finish = LocalDateTime.parse(scanner.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = scanner.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = scanner.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour,pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("Fatura: ");
        System.out.println("Pagamento basico: " + String.format("%.2f" , cr.getInvoice().getBasicPayment()));

        System.out.println("Imposto: " + String.format("%.2f" ,cr.getInvoice().getTax()));

        System.out.println("Pagamento total: " + String.format("%.2f" ,cr.getInvoice().getTotalPayment()));


        scanner.close();

    }
}
