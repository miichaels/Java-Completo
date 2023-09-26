package java_completo;

import java.util.Scanner;

public class exercicioFor2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

         int x = scanner.nextInt();
         int y = scanner.nextInt();

         int min, max;
        if (x < y) {
            min = x;
            max = y;
        }else {
            min = y;
            max = x;
        }

        int soma = 0;
        for (int i = min+1; i < max; i++){
            if (i % 2 != 0){
                soma = soma + 1;
            }
        }

        System.out.println(soma);

    }


}
