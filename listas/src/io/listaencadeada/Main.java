package io.listaencadeada;

public class Main {

    public static void main(String[] args) {

        var listaEncadeada = new ListaEncadeada<String>();

        listaEncadeada.add("A");
        listaEncadeada.add("B");
        listaEncadeada.add("C");
        listaEncadeada.add("D");

        System.out.println(listaEncadeada.get(0));
        System.out.println(listaEncadeada.get(1));
        System.out.println(listaEncadeada.get(2));
        System.out.println(listaEncadeada.get(3));

        System.out.println(listaEncadeada);

        System.out.println(listaEncadeada.remove(3));

        System.out.println(listaEncadeada);

    }

}
