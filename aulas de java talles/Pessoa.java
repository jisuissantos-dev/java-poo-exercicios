 public class Pessoa { //o qu epessoa tem qu eter pra minh aregra de negócio
     String nomeCompleto; //sistema para pessoas possam ofertar na minha igreja
                        //minha regra de negócio: o que preciso saber dela para receber a oferta dessa pessoa,
     int idade;           //  os atributos que preciso são as string, int e assim por diante que coloquei ai no cod
     String nome;
     boolean isMaiorDeIdade;
     Endereco enderecoPessoa;  
      //passar parametros para função

     void idadeImprimir(){ //essa função basicamente substitui o system.out.print no cod main 
      System.out.println("A idade da pessoa é : " + idade);
     }

     void pegarValorIdade(int idadeRecebida){ //função void não tem retorno
      idade = idadeRecebida;
      idadeImprimir();
     }
                    //quando eu espero que a função retorne algo como uma string (um texto) significaq= que quero que tenha retorno
     boolean isPessoaMaiorDeIdade(){ //funções que não são void eles tem retorno
      isMaiorDeIdade = idade >= 18; //aqui temos uma comparação
        System.out.println("A pessoa é maior de idade: " + isMaiorDeIdade);
         return isMaiorDeIdade; //final da função fica onde declaramos o retorno, oq escrever dps de return não executa
     }
    }
  
