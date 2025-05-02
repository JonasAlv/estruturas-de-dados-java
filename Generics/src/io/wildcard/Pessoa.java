package io.wildcard;

public class Pessoa extends Cidadao {

    private String nome;
    private int idade;

    public Pessoa(String cpf, int idade) {
        super(cpf);
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
