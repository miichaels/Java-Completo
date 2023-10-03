package java_completo.membrosEstaticos.util;

public class Calculator {

    //Valor é constante e não mudara (final)
    //Sempre em maiusculo - Para 2 palavra colocar _  EX_TESTE
    public static final double PI = 3.1459;

    public static double circumference(double radius){
        return 2.0 * PI * radius;
    }

    public static double volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
