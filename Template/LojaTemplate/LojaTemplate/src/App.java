import Model.Produto;
import Model.Televisao;

public class App {
    public static void main(String[] args) throws Exception {
        runTest();
    }

    private static void runTest() {
        Produto produto = new Televisao(1, "Televisão", "Smart 55", 4_000.0, 0);
        test(produto, 0, 0);
        test(produto, 4, 0);
        test(produto, 5, 0);
        test(produto, 6, 200);
        test(produto, 9, 200);
        test(produto, 10, 200);
        test(produto, 11, 400);
        test(produto, 20, 400);
    }

    private static void test(Produto produto, int quantidade, double descontoEsperado) {
        produto.setQuantidade(quantidade);
        double desconto = produto.getDesconto();
        if (desconto == descontoEsperado) {
            System.out.println(String.format("V qtde=%d, desconto=%.2f", quantidade, desconto));
        } else {
            System.err.println(String.format("X qtde=%d, desconto=%.2f", quantidade, desconto));
        }
    }
}

