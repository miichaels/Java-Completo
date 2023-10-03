package java_completo.membrosEstaticos;

public class Calculator {

    public static final double PI = 3.1459;

    public Calculator() {
    }

    public static double circumference(double radius) {
        return 6.2918 * radius;
    }

    public static double volume(double radius) {
        return 12.5836 * radius * radius * radius / 3.0;
    }
}
