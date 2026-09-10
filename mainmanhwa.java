public class mainmanhwa {

    public static void main (String [] args){
        //criei 4 objetos da classe denominada manhwa
        Manhwa manhwa1 = new Manhwa("O único destino para os vilões é a morte: volume 1", "Gwon Gyeoeul", 260);
        Manhwa manhwa2 = new Manhwa("Solo Leveling: Volume 1", "Chugong", 320);
        Manhwa manhwa3 = new Manhwa("The Beginning After the End: Volume 1", "TurtleMe", 192);
        Manhwa manhwa4 = new Manhwa("O Horizonte: Volume 1", "Jung Ji Hun", -30);   

        System.out.println(manhwa1); //Imprime informações referente ao primeiro manhwa cadastrado.
        manhwa1.emprestar(); // essa função pergunta se o manhwa está disponível e o empresta se for verdade.

         System.out.println(manhwa1); 
        manhwa1.emprestar(); //Aqui tentamos emprestar o mesmo manhwa que já foi emprestado anteriormente, quando essa parte do código compilar o que se espera é que o método retorne false, indicando que o empréstimo falhou.

        System.out.println(manhwa4); //Vai imprimir sobre o manhwa 4 cadastrado e como há um valor negativo em quantidade de páginas, o valor será colocado como 0 por causa da validação no construtor principal da classe.

       System.out.println("Total cadastrados: " + Manhwa.gettotalCadastrado());
    } 
    
}
