package Model;

public abstract class AlunoTemplate {
    public final String processarSituacao(Aluno aluno) {
        double notaFinal = calcularNotaFinal(aluno);
        int frequencia = aluno.getFrequencia();
        return determinarSituacao(notaFinal, frequencia);

    }

    protected abstract double calcularNotaFinal(Aluno aluno);

    protected abstract String determinarSituacao(double notaFinal, int frequencia);

}