package io.wildcard.lowerbounded;

import io.wildcard.Pessoa;

import java.util.List;

public class LowerBounded {

    public void imprimeLista(List<? super Pessoa> listaPessoas) {
        for(Object e : listaPessoas) {
            System.out.println(e);
        }
    }
}
