package java_completo.excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecoes {
    public static void main(String[] args) {

        method1();
        System.out.println("Fim do programa");


    }

    public static void method1() {
        System.out.println("-- METHOD1 START --");
            method2();
        System.out.println("-- METHOD1 END --");
    }


    public static void method2() {

        System.out.println("-- METHOD2 START --");
            Scanner scanner = new Scanner(System.in);

            try {
                String[] vect = scanner.nextLine().split(" ");
                int position = scanner.nextInt();
                System.out.println(vect[position]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid position");
                e.printStackTrace();
                scanner.next();
            } catch (InputMismatchException e) {
                System.out.println("Não é possivel selecionar letras");
            }


            scanner.close();
        System.out.println("-- METHOD2 END --");
    }
}


