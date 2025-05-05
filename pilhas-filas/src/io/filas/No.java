package io.filas;

public class No<T> {
    private T object;
    private No<T> refNo;

    public No() {
    }

    public No(T object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "[Objeto=No Valor=" + object + ']';
    }
}