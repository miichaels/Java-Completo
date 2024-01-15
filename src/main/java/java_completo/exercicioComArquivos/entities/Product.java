package java_completo.exercicioComArquivos.entities;

public class Product {

    private String name;
    private Double price;
    private Integer quantity;

    public Product(String name, Double preco, Integer quantity) {
        this.name = name;
        this.price = preco;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPreco() {
        return price;
    }

    public void setPreco(Double preco) {
        this.price = preco;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double total(){
        return price * quantity;
    }
}
