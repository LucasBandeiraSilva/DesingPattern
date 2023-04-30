package Model;

public class AlunoBuilder {
    private int id;
    private String nome;
    private String turma;
    private double nota;
    private int frequencia;

    public AlunoBuilder SetId(int id) {
        this.id = id;
        return this;
    }

    public AlunoBuilder SetNome(String nome) {
        this.nome = nome;
        return this;
    }

    public AlunoBuilder SetTurma(String turma) {
        this.turma = turma;
        return this;
    }

    public AlunoBuilder SetNota(double nota) {
        this.nota = nota;
        return this;
    }

    public AlunoBuilder SetFrequencia(int frequencia) {
        this.frequencia = frequencia;
        return this;
    }

    public Aluno build() {
        return new Aluno(id, nome, turma, nota, frequencia);
    }
}
