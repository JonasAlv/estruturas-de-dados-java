package io.wildcard;

public class Pessoa extends Cidadao {

    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String cpf, String nome, int idade, String sexo) {
        super(cpf);
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
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
