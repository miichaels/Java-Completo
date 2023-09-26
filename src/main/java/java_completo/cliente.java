package java_completo;

import java.util.Locale;

public class cliente {
    public static void main(String[] args) {

        String name = "mike";
        int x = 12;
        System.out.println(x);
        System.out.println(name);
        
        double k = 10.3564;
        
        System.out.printf("%.2f%n", k);
        System.out.printf("%.4f%n", k);
        
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", k);
        System.out.println("Resultado é: " + k + " Metros");
    }
}
