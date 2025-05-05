package io.filas;

public class Fila<T> {

    private No<T> entradaFila = null;

    public Fila() {
        this.entradaFila = null;
    }

    public void enqueue(T o){
        No novoNo = new No(o);
        novoNo.setRefNo(entradaFila);
        entradaFila = novoNo;
    }

    public T dequeue(){
        if(!isEmpty()){
            No primeiro = entradaFila;
            No auxiliar = entradaFila;
            while(true){
                if(primeiro.getRefNo() != null) {
                    auxiliar = primeiro;
                    primeiro = primeiro.getRefNo();
                }else{
                    auxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiro.getObject();
        }
        return null;
    }

    public T first(){
        if(!isEmpty()){
            No primeiro = entradaFila;
            while(true){
                if(primeiro.getRefNo() != null) {
                    primeiro = primeiro.getRefNo();
                }else{
                    break;
                }
            }
            return (T) primeiro.getObject();
        }
        return null;
    }

    public boolean isEmpty(){
        return entradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No auxiliar = entradaFila;

        if(entradaFila != null){
            while(true){
                stringRetorno += "[" + auxiliar.getObject() + "]---> ";
                if(auxiliar.getRefNo() != null){
                    auxiliar = auxiliar.getRefNo();
                }else{
                    stringRetorno += "null";
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}