package io.atribuicaoreferencia;

public class Main {

    public static void main(String[] args) {

        //atribuição
        int intA = 1;
        int intB = intA;

        System.out.println(intB);

        intA = 10;
        System.out.println(intB);
        System.out.println("_".repeat(30));

        //mem reference
        MyObj objA = new MyObj(10);
        MyObj objB = objA;

        System.out.println(objB);

        objA.setNum(1);
        System.out.println(objB);
    }

}
