package
        io.pilhas;

public class Pilha {

    No topoPilha = null;

    public void push(No novoTopo){
        No salvarTopoAtual = topoPilha;
        topoPilha = novoTopo;
        topoPilha.setRefNo(salvarTopoAtual);
    }

    public No pop(){
        if(!isEmpty()){
            No topoRetirado = topoPilha;
            topoPilha = topoPilha.getRefNo();
            return topoRetirado;
        }
        return null;
    }

    public No top(){
        return topoPilha;
    }

    public boolean isEmpty(){
        return topoPilha == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "------------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "------------\n";
        No noAuxiliar = topoPilha;
        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "============";
        return stringRetorno;
    }
}