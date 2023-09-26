package java_completo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite tres nomes: ");
		
		String s1, s2 , s3;
		
		s1 = ler.nextLine();
		s2 = ler.nextLine();
		s3 = ler.nextLine();
		
		
		System.out.println("Itens Digitados: " );
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
