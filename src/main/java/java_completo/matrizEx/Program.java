package java_completo.matrizEx;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        //tamanho de linhas e colunas = n
        int[][] matrx = new int[n][n];
        int count = 0;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrx[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Main diagonal: ");
        for(int i=0; i<n; i++){
            System.out.print(matrx[i][i] + " ");
        }
        System.out.println();

        for(int i=0; i<n ; i++){
            for (int j=0; j<n; j++){
                if(matrx[i][j] < 0){
                    count++;
                }
            }
        }
        System.out.println("Negative numbers = " + count);

        scanner.close();

    }
}
