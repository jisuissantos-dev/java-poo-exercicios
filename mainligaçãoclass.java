public class mainligaçãoclass {
    public static void main (String [] args){
        Cliente cliente1 = new Cliente ("Marinete", "123.145.236-88");
        ContaBancaria contaCorrente = new ContaBancaria("001", cliente1);
        ContaBancaria contaPoupanca = new ContaBancaria ("002", cliente1, 200);

        contaPoupanca.depositar(150); //depositando na conta poupança da cliente do banco.
        contaCorrente.saque(20); //Saque da conta corrente da cliente, como a conta estava com saldo zeradoo saque será negado.

        cliente1.setnome("Andriana"); //alterando o nome pelo objeto original.

    //As duas contas não guardam cópias separadas do cliente, elas guardam uma referência para o mesmo objeto (cliente1) na memória. 
    // Dessa forma, quando udamos o nome do cliente a alteração é vista por qualquer referência que aponte para esse mesmo objeto.

     //exibindo o extrato da conta da cliente
        contaPoupanca.exibirExtrato();  
        contaCorrente.exibirExtrato();

    }
    
}
