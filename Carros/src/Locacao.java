public class Locacao {
    private Cliente cliente;
    private Carro carro;
    private int dias;

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    Locacao(Cliente cliente,Carro carro,int dias){
        this.cliente = cliente;
        this.carro = carro;
        this.dias = dias;
    }

    double calcularValorTotal(){
        return dias * carro.getValorDiaria();
    }

    void exibirResumo(){
        cliente.exibirCliente();
        carro.exibirCarro();
        System.out.println("Valor total:"+calcularValorTotal());


    }

}
