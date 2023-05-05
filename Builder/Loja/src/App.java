import model.ProdutoBuilder;
import service.DescontoService;
import model.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        runTest();
    }
    private static void runTest(){
       var produto = new ProdutoBuilder()
       .setId(1)
       .setNome("Televisão")
       .setDescricao("Smart 55")
       .setPreco(4_000.0)
       .setQuantidade(0)
       .build();

       var service = new DescontoService();
        test(service, produto, 0, 0);
        test(service, produto, 4, 0);
        test(service, produto, 5, 0);
        test(service, produto, 6, 200);
        test(service, produto, 9, 200);
        test(service, produto, 10, 200);
        test(service, produto, 11, 400);
        test(service, produto, 20, 400);
       
       
      
    }
    private static void test(DescontoService service, Produto produto, int quantidade, double descontoEsperado) {
        //produto.setQuantidade(quantidade);
        produto =  new ProdutoBuilder().setQuantidade(quantidade).build();

        var desconto = service.calcularDesconto(produto);
        if (desconto == descontoEsperado) {
            System.out.println(String.format("V qtde=%d, desconto=%.2f", quantidade, desconto));
            return;
        } 
        System.err.println(String.format("X qtde=%d, desconto=%.2f", quantidade, desconto));

    }

}
