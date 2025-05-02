package io.wildcard.unknown;

import java.util.List;

public class Unknown {

    public void imprimeLista(List<?> lista) {

        for (Object e : lista) {
            System.out.println(e);
        }
    }
}
