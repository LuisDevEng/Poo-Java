public class Medico {
    private String nome;
    private String esp;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEsp() {
        return esp;
    }

    public void setEsp(String esp) {
        this.esp = esp;
    }
    Medico(String nome,String esp){
        this.nome = nome;
        this.esp = esp;
    }
    void exibirDados(){
        System.out.println("Nome:"+nome);
        System.out.println("Especialidade:"+esp);
    }
}
