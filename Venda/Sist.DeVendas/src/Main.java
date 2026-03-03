//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Celular",2500.50);
        Venda venda1 = new Venda(produto1,10);
        System.out.println("Valor total da venda:"+venda1.calcularTotal());
    }
}