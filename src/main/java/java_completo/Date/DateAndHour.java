package java_completo.Date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndHour {

    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();

        //padrão GMT
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2022-07-20");

        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");

        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate d08 = LocalDate.parse("20/07/2022" , fmt1);

        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        LocalDate d10 = LocalDate.of(2023, 11 , 7);

        LocalDateTime d11 = LocalDateTime.of(2023, 11 , 7 , 1,30);

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        //padrão GMT
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);





    }
}
