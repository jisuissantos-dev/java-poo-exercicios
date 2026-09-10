public class Produto{
    String nome;
    int quantidadeEmEstoque;
    double preco;

    void venderUnidade(int quantidade){
        quantidadeEmEstoque = quantidadeEmEstoque - quantidade ;
    }

    void receberEstoque(int valorEstoqueRecebido){
        quantidadeEmEstoque = quantidadeEmEstoque + valorEstoqueRecebido ;
    }

    

     double  calcularValorTotalEstoque(double preco, int quantidade){
         return preco * quantidade;
    }

}