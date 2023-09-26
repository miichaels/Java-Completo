package java_completo.Entities;

import java.util.Locale;
import java.util.Scanner;

public class ProgramPOO {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Triangulo x , y;

        x = new Triangulo();
        y = new Triangulo();


        System.out.println("Enter the measures of triangle X:  ");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();
        System.out.println("Enter the measures of triangle Y:  ");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        double p = (x.a + x.b + x.c) / 2;

        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));


        p = (y.a + y.b + y.c) / 2;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if ( areaX > areaY){
            System.out.println("Maior area: X");
        }else {
            System.out.println("Maior area: Y");
        }

    }
}
