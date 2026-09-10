public class mainTest { 
 //POO aula focada na introdução
 //vamos instanciar (chamamos a classe pessoa)
     public static void main(String[] args){
       Pessoa p1 = new Pessoa(); //criar objeto pessoa
       p1.nome = "talles ";
       p1.idade = 20;

       p1.pegarValorIdade(20);
      System.out.println("A pessoa é maior de idade: " + p1.isPessoaMaiorDeIdade());

      boolean eleMaiorDeIdade = false;
      System.out.println(eleMaiorDeIdade);
      eleMaiorDeIdade = p1.isPessoaMaiorDeIdade();
      System.out.println(eleMaiorDeIdade);

      Endereco endereco1 = new Endereco();
      endereco1.rua = "Lisbon";
      endereco1.cidade = "chitanzin"; 
 
      
    }
  }



