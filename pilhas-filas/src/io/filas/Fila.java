package io.filas;

public class Fila {

    private No entradaFila = null;

    public Fila() {
        this.entradaFila = null;
    }

    public void enqueue(No novoNo){
        novoNo.setRefNo(entradaFila);
        entradaFila = novoNo;
    }

    public No dequeue(){
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
            return primeiro;
        }
        return null;
    }

    public No first(){
        if(!isEmpty()){
            No primeiro = entradaFila;
            while(true){
                if(primeiro.getRefNo() != null) {
                    primeiro = primeiro.getRefNo();
                }else{
                    break;
                }
            }
            return primeiro;
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
                stringRetorno += "[No{objeto="+ auxiliar.getObject() +"}]--->";
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