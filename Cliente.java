public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getnome(){
        return nome;
    }

    public String getcpf(){
        return cpf;
    }

    public void setnome(String novoNome){
        nome = novoNome;
    }
}
