public class MainCalculadoraTalles{ //aula 3 e 4 
  public static void main(String [] args){

  CalculadoraTalles c1 = new CalculadoraTalles();
  //c1.nome = "Talles";
  //c1.idade = 20;
        c1.valor1 = 10;
        c1.valor2 = 20;
        c1.somar();
        System.out.println(c1.resultado);

        CalculadoraTalles c2 = new CalculadoraTalles();
        c2.somarValores(10, 20);
        System.out.println(c2.resultado);

  }
}