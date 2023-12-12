package java_completo.areaDeFormas;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Shape> list = new ArrayList<>();


        System.out.print("Entre com o numero da forma: ");
        int n = scanner.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Shape #" + i + "data: ");
            System.out.print("Rectangle or Cicle (r/c)? ");
            char ch = scanner.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(scanner.next());

            if (ch == 'r'){
                System.out.println("Largura: ");
                double largura = scanner.nextDouble();
                System.out.println("Altura: ");
                double altura = scanner.nextDouble();
                list.add(new Rectangle(color , largura, altura));
            }
            else {
                System.out.println("Radius: ");
                double radius = scanner.nextDouble();
                list.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape shape : list){
            System.out.println(String.format("%.2f", shape.area()));
        }

        scanner.close();

    }

}
