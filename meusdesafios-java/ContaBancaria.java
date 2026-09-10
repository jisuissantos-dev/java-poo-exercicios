public class ContaBancaria{
    private String titular;
    protected String numeroConta;
    private double saldo;
    private boolean usuarioTemConta;

    public ContaBancaria (String titularDaConta){
        System.out.println("Novo titular no banco criado com sucesso!");
        titular = titularDaConta;
    }

    public ContaBancaria (String titularDaConta, double saldoInicial){
        System.out.println("Novo titular no banco criado com sucesso!");
        titular = titularDaConta;
        saldo = saldoInicial;
    }

    public ContaBancaria (String titularDaConta, double saldoInicial, String numeroDaContaDoUsuario){
        System.out.println("Novo titular no banco criado com sucesso");
        titular = titularDaConta;
        numeroConta = numeroDaContaDoUsuario;
        saldo = saldoInicial;
    }


    public String gettitular(){
        return titular;
    }

     public void settitular(String nomeTitularRecebido){
        titular = nomeTitularRecebido;
     }

     public String getnumeroConta(){
        return titular;
    }

     public void setnumeroConta(String numeroDaContaRecebido){
        titular = numeroDaContaRecebido;
     }


     public boolean isUsuarioTemConta(){
        return usuarioTemConta;
     }

     public void setUsuarioTemConta (boolean usuarioTemConta){
       this.usuarioTemConta = usuarioTemConta;
     }


    

    public double verSaldo(){
        return saldo;
    }
    void depositar(double valor){
        saldo = saldo + valor;
    }

    boolean sacar(double valor){
        if (valor <= saldo){
          saldo = saldo - valor;
         return true ;
        } else {
            return false;
        }
        
    }

    
}