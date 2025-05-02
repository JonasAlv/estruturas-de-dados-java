package io.wildcard;

public class Aluno extends Pessoa {

    private String nome;
    private String curso;
    private String idade;
    private String matricula;

    public Aluno(String cpf, String nome, int idade, String sexo, String matricula, String curso) {
        super(cpf, nome, idade, sexo);
        this.curso = curso;
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
