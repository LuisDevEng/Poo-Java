public class Cliente {
    private String nome;
    private String cnh;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    Cliente(String nome,String cnh){
        this.nome = nome;
        this.cnh = cnh;
    }
    void exibirCliente(){
        System.out.println("Nome:"+nome);
        System.out.println("Cnh:"+cnh);
    }
}
