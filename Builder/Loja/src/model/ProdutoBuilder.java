package model;

public class ProdutoBuilder {
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private int quantidade;

    public ProdutoBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public ProdutoBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public ProdutoBuilder setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public ProdutoBuilder setPreco(double preco) {
        this.preco = preco;
        return this;
    }

    public ProdutoBuilder setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    public Produto build() {
        return new Produto(id, nome, descricao, preco, quantidade);

    }

}
