public class Venda {
    private Produto produto;
    private int quantidade;

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Venda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    double calcularTotal(){
        return quantidade * produto.getPreco();
    }

}
