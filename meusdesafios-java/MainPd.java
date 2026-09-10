public class MainPd{

    public static void main(String[] args){

        Produto p1 = new Produto();

        p1.nome = "Caderno";
        p1.preco = 5.50;
        p1.quantidadeEmEstoque = 20;

        System.out.println("Estoque atual de " + p1.nome + " = " + p1.quantidadeEmEstoque);

        double valorTotal = p1.calcularValorTotalEstoque(5.50, p1.quantidadeEmEstoque);
        System.out.println("Valor total do estoque de " + p1.nome + " = " + valorTotal);

        p1.venderUnidade(3);
        System.out.println("Estoque atual de " + p1.nome + " pós vendas é = " + p1.quantidadeEmEstoque);

        p1.receberEstoque(10);
        System.out.println("Novas unidades de " + p1.nome+ " recebidos = " + p1.quantidadeEmEstoque);

        System.out.println("Estoque atual de " + p1.nome + " = " + p1.quantidadeEmEstoque);

    }
}