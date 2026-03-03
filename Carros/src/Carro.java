public class Carro {
    private String modelo;
    private String placa;
    private double valorDiaria;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    Carro(String modelo, String placa, double valorDiaria ){
        this.modelo = modelo;
        this.placa = placa;
        this.valorDiaria = valorDiaria;

    }
    void exibirCarro(){
        System.out.println("Modelo:"+modelo);
        System.out.println("Placa:"+placa);
        System.out.println("Valor da diaria:"+valorDiaria);
    }
}
