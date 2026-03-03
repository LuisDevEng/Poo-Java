//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Paciente paciente1 = new Paciente("Jubscreudo","09432772306");
Medico medico1 = new Medico("DrNerfario","Odonto");
Consulta consulta1 = new Consulta(paciente1,medico1,200.99);
consulta1.exibirResumo();


    }
}