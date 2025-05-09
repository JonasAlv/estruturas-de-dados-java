package io.listacircular;

public class Main {

    public static void main(String[] args) {

        var lista = new ListaCircular<String>();

        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");

        System.out.println(lista.get(0));

        System.out.println(lista);

        lista.remove(0);
        System.out.println(lista);

        System.out.println(lista.get(0));

    }

}
