package java_completo.interfaces.model.services;

import java_completo.interfaces.entities.CarRental;
import java_completo.interfaces.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;

    private TaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){
        //Duration.between  == encontra a duracao entre dois instantes
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60;

        double basicPayment;
        if (hours <= 12.0){
            //Math.ceil arredonda o valor para cima
            basicPayment = pricePerHour * hours;
        }else {
            //Math.ceil arredonda o valor para cima
            basicPayment = pricePerDay * (hours/24);
        }

            basicPayment = Math.ceil(basicPayment);
            double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }


}
