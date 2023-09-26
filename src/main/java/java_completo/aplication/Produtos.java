package java_completo.aplication;

public class Produtos {
    public String nome;
    public double preco;
    public int quantidade;

    public Produtos() {
    }

    public double totalEmEstoque() {
        return this.preco * (double)this.quantidade;
    }

    public void adicionarProduto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void saidaEstoque(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        String var10000 = this.nome;
        return var10000 + ", $" + String.format("%.2f", this.preco) + ", " + this.quantidade + " unidades, Total: $ " + String.format("%.2f", this.totalEmEstoque());
    }
}
