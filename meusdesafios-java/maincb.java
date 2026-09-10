public class maincb{

    public static void main (String[] args){

        ContaBancaria userc1 = new ContaBancaria("Marinete", 500, "123098");
        System.out.println("Nome do usuário da conta é : " + userc1.gettitular());
        System.out.println("Número da conta do  usuário é : " + userc1.getnumeroConta());
        System.out.println("Saldo da conta do usuário é : " + userc1.verSaldo());

        userc1.settitular("Andrian");
        System.out.println("Nome do usuário da conta é : " + userc1.gettitular());
        System.out.println("Número da conta do  usuário é : " + userc1.getnumeroConta());
        System.out.println("Saldo da conta do usuário é : " + userc1.verSaldo());

        userc1.depositar(100);
        userc1.sacar(400);
            System.out.println("Saldo do usuário na conta é : " + userc1.verSaldo());


        /*  c1.titular = "Marinete";
         c1.numeroConta = "123098";
         c1.saldo = 1000;
        System.out.println("Saldo de " + c1.titular + " = " + c1.saldo);

        ContaBancaria c2 = new ContaBancaria();
         c2.titular = "Andrian";
         c2.numeroConta = "098123";
         c2.saldo = 10000;
        System.out.println("Saldo de " + c2.titular + " = " + c2.saldo);

         c1.depositar(100);
         c2.depositar(500);
        System.out.println("Saldo  pós depósito de " + c1.titular +  " = " + c1.saldo);
        System.out.println("Saldo atualizado pós depósito de " + c2.titular + " = " + c2.saldo);

         c1.sacar(120);
         c2.sacar(1200);
         System.out.println("Saldo atualizado pós saque de " + c1.titular + " = " + c1.saldo);
        System.out.println("Saldo atualizado pós saque de "+ c2.titular + " = " + c2.saldo);
      */
    }
}