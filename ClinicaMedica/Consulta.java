public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private double valor;

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    Consulta(Paciente paciente, Medico medico, double valor){
        this.paciente = paciente;
        this.medico = medico;
        this.valor = valor;
    }
    void exibirResumo(){
        paciente.exibirDados();
        medico.exibirDados();
        System.out.println("Valor:"+valor);
    }
}
