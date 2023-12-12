package java_completo.areaDeFormas;

public class Rectangle extends Shape{

    private double largura;
    private double altura;

    public Rectangle(){

    }

    public Rectangle(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public Rectangle(Color color, double largura, double altura) {
        super(color);
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return largura * altura;
    }
}
