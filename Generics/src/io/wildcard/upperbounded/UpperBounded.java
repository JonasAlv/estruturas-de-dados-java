package io.wildcard.upperbounded;

import io.wildcard.Aluno;
import io.wildcard.Cidadao;
import io.wildcard.Pessoa;

import java.util.List;

public class UpperBounded {

    public void imprimeLista(List<? extends Pessoa> listaPessoas) {
        for(Cidadao e : listaPessoas) {
            System.out.println(e);
        }

    }
}
