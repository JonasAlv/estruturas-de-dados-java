package io.listadupla;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        var lista = new ListaDuplamenteEncadeada<String>();

        lista.add("c1");
        lista.add("c2");
        lista.add("c3");
        lista.add("c4");
        lista.add("c5");
        lista.add("c6");
        lista.add("c7");

        System.out.println(lista);

        lista.remove(6);
        lista.add("99");

        System.out.println(lista);
    }

}
