package Model;

public class Aluno {

    private int id;
    private String nome;
    private String turma;
    private double nota;
    private int frequencia;

    public Aluno(int id, String nome, String turma, double nota, int frequencia) {
        this.id = id;
        this.nome = nome;
        this.turma = turma;
        this.nota = nota;
        this.frequencia = frequencia;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTurma() {
        return turma;
    }

    public double getNota() {
        return nota;
    }

    public int getFrequencia() {
        return frequencia;
    }

}