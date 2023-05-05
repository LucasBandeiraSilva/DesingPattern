package Model;

public class Televisao extends Produto {

    public Televisao(int id, String nome, String descricao, double preco, int quantidade) {
        super(id, nome, descricao, preco, quantidade);
    }

    @Override
    public double getDesconto() {

        if (getQuantidade() > 10) {
            return getPreco() * 0.1;
        } else if (getQuantidade() > 5) {
            return getPreco() * 0.05;
        } else {
            return 0;
        }
    }

}
