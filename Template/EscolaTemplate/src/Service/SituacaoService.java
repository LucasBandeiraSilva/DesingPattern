package Service;

import Model.Aluno;
import Model.AlunoTemplate;

public class SituacaoService extends AlunoTemplate {
    private double mediaMinima = 7;
    private int frequenciaMinima = 75;
    private double notaMinimaAprovar = 5;
    private double notaMinimaExame = 3;

    @Override
    protected double calcularNotaFinal(Aluno aluno) {
        double nota = aluno.getNota();
        int frequencia = aluno.getFrequencia();

        if (frequencia < frequenciaMinima) {
            return 0;
        }

        if (nota < notaMinimaExame) {
            return nota;
        }

        if (nota < notaMinimaAprovar) {
            return (nota + notaMinimaAprovar) / 2;
        }

        return nota;
    }

    @Override
    protected String determinarSituacao(double notaFinal, int frequencia) {
        if (frequencia < frequenciaMinima) {
            return "Reprovado por falta";
        }

        if (notaFinal < notaMinimaAprovar) {
            if (notaFinal < notaMinimaExame) {
                return "Reprovado por nota";
            }
            return "Exame";
        }

        return "Aprovado";
    }

}
