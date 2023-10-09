package java_completo.aplication;

import java.util.Locale;
import java.util.Scanner;

public class loja {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrar no produto data: ");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Preco: ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade no estoque: ");
        int quantidade = scanner.nextInt();

        Produtos produto = new Produtos(nome, preco, quantidade);

        System.out.println();
        System.out.println("Produto data: " + produto);
        System.out.println();
        System.out.println("Entre com o numero de produtos para adicionar no estoque: ");
        int adicionar = scanner.nextInt();

        produto.adicionarProduto(adicionar);
        System.out.println("Dados atualizados: " + produto);
        System.out.println("Entre com o numero de produtos para retirar do estoque: ");
        int remover = scanner.nextInt();

        produto.saidaEstoque(remover);
        System.out.println("Dados atualizados: " + produto);
        scanner.close();
    }
}
