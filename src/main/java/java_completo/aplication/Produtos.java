package java_completo.aplication;

public class Produtos {

    public String nome;
    public double preco;
    public int quantidade;

    public double totalEmEstoque(){
        return preco * quantidade;
    }

    public void adicionarProduto(int quantidade){
        this.quantidade += quantidade;  // this > alto referencia para o objeto
    }

    public void saidaEstoque(int quantidade){
        this.quantidade -= quantidade;
    }

    public String toString(){
        return nome
                + ", $"
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + " unidades, Total: $ "
                +  String.format("%.2f", totalEmEstoque());
    }

}
