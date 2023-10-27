package java_completo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Michael");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        list.add("Amanda");
        //adicionando um elemento na posicao dois
        list.add(2, "Marco");

        //exibir tamanho da lista
        System.out.println(list.size());

        for (String x : list){
            System.out.println(x);
        }

        System.out.println("---------------------------");

        //remover um item da lista
        list.remove("Ana");
        //remover pela posicao
        //list.remove(1);

        //PREDICADO - Retorna como true or false - funcao para remover item com a letra M
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list){
            System.out.println(x);
        }

        System.out.println("---------------------------");

        //encontrar posicao de um elemento
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Bob: " + list.indexOf("Marco"));
        System.out.println("---------------------------");

        //converter a list para stream, fazer a operação lambda que pega os itens que começa com A e voltar para lista
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : result){
            System.out.println(x);
        }

        System.out.println("---------------------------");
        //encontrar o primeiro elemento da lista que comece com a letra A
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);

        System.out.println(name);




    }

}

