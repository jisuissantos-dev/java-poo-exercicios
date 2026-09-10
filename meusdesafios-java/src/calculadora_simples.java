import java.util.Scanner;

public class calculadora_simples {
   public static void main (String [] args) {
      
    Scanner scanner = new Scanner (System.in);

     System.out.print("Digite o primeiro número: ");
     float num1 = scanner.nextFloat();

     System.out.print("Digite o segundo número: ");
     float num2 = scanner.nextFloat (); 
      
    System.out.print("Escolha a operação: +, -, *, /");
    char operacao = scanner.next().charAt(0);

    float resultado;

      switch (operacao) {
        case '+' :
            resultado = num1+num2;
            System.out.print("Resiltado: " + resultado);
            break;
        case '-':
            resultado = num1-num2;
            System.out.print("Resultado: " + resultado);
            break;
            case '*':
                resultado = num1*num2;
                System.out.print("Resultado: " + resultado);
                break;
                case '/':
                    if (num2 != 0) {
                        resultado = num1/num2;
                        System.out.print("Resultado:" + resultado);
                    } else {
                        System.out.print("Erro: Divisão por zero não é permitida.");
                    }
                    break;
                 default:
                        System.out.print("Operação inválida.");
      }

           scanner.close();


   } 
}
