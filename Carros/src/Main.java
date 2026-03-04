//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Fiat","ARO129",100);
        Cliente cliente1 = new Cliente("Luis","1231412");
        Locacao locacao1 = new Locacao(cliente1,carro1,12);
        locacao1.exibirResumo();
        }
    }
