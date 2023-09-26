package java_completo.aplication;

import java.util.Locale;
import java.util.Scanner;

public class loja {
    public loja() {
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Produtos produto = new Produtos();
        System.out.println("Entrar no produto data: ");
        System.out.print("Nome: ");
        produto.nome = scanner.nextLine();
        System.out.print("PreÃ§o: ");
        produto.preco = scanner.nextDouble();
        System.out.print("Quantidade no estoque: ");
        produto.quantidade = scanner.nextInt();
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
