public class ContaBancaria{
    private String numeroConta;
    private double saldo;
    Cliente clienteBanco;

    public ContaBancaria(String numeroConta, Cliente clienteBanco){
        this(numeroConta, clienteBanco, 0 );
    }

    public ContaBancaria(String numeroConta, Cliente clienteBanco, double saldo){
        this.numeroConta = numeroConta;
        this.clienteBanco = clienteBanco;
        this.saldo = saldo;
    }

    void depositar(double valor){
        saldo = saldo + valor;
    }

    void  saque(double valor){
        if (valor > saldo){
            System.out.println("Saque negado");
        } else {
            saldo = saldo - valor;
        }
    }
    
    void exibirExtrato(){ 
        System.out.println("Número da conta: " + numeroConta + " |Cliente: " + clienteBanco.getnome() +  " |Saldo = " + saldo);
    }

    

}