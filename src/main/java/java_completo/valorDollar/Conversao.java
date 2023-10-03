package java_completo.valorDollar;

public class Conversao {

    public static double valorDollar;
    public static double valorComprado;
    public static double valorConvertido;


    public static double conversao(){
        valorConvertido = valorDollar * valorComprado;
        valorConvertido *= 1.06;
        return valorConvertido;
    }



}

