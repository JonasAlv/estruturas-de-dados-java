package io.listacircular;

public class ListaCircular<T> {

    private No<T> head;
    private No<T> tail;
    private int tamanhoLista;

    public ListaCircular() {
        this.head = null;
        this.tail = null;
        this.tamanhoLista = 0;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(tamanhoLista == 0){
            this.head = novoNo;
            this.tail = this.head;
            this.head.setNoProximo(this.tail);
        }else{
            novoNo.setNoProximo(this.tail);
            this.head.setNoProximo(novoNo);
            this.tail = novoNo;
        }
        this.tamanhoLista++;
    }

    public void remove(int index){
        if(index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException("O índice maior que o tamanho da lista");

        No<T> noAuxiliar = tail;
        if(index == 0){ //estou na tail
            this.tail = this.tail.getNoProximo();
            this.head.setNoProximo(tail);
        }else if(index == 1){
            this.tail.setNoProximo(this.tail.getNoProximo().getNoProximo());
        }else{
            for(int i = 0; i < index-1; i++){
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }
        this.tamanhoLista--;
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index){
        if(isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia");

        if(index == 0){
            return this.tail;
        }

        No<T> noAuxiliar = this.tail;
        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }

    public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = this.tail;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() +"}]--->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += size() != 0 ? "(Retorna ao início)" : "[]";
        return strRetorno;
    }

}