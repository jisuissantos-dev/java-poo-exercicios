public class mainendereco{ //relação entre classes 
  public static void main(String[] args){
    Pessoa pessoa1 = new Pessoa();
    pessoa1.nome = "juan";

    Endereco endereco1 = new Endereco();
    endereco1.rua = "Rua lisbon";
    endereco1.cidade = "Cidade chitanzi";

    pessoa1.enderecoPessoa = endereco1; 
    System.out.println("Nome: " + pessoa1.nome);
    System.out.println("Endereço: " + pessoa1.enderecoPessoa.rua); //o primeiro ponto acessa tudo em pessoa1, o segundo ponto acessa tudo dentro de endereço e rua ta dentro disso

    
  }
}