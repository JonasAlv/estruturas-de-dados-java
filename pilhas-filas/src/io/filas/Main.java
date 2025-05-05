package io.filas;

public class Main {

    public static void main(String[] args) {

        Fila fila = new Fila();

        fila.enqueue(new No("primeiro"));
        fila.enqueue(new No("segundo"));
        fila.enqueue(new No("terceiro"));
        fila.enqueue(new No("quarto"));

        System.out.println(fila);

        System.out.println(fila.dequeue());

        System.out.println(fila);

        fila.enqueue(new No("ultimo"));

        System.out.println(fila.first());

        System.out.println(fila);


    }

}
