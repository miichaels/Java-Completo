package java_completo.entities;

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

        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if ( areaX > areaY){
            System.out.println("Maior area: X");
        }else {
            System.out.println("Maior area: Y");
        }

    }
}
