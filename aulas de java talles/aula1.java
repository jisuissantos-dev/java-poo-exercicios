import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);

        System.out.println("Digite um numero inteiro: ");
        int num = sc.nextInt();

         if (num % 2 == 0) {
            System.out.print("O numero é par ");
         } else {
            System.out.print("O numero é impar ");
         }
        
     sc.close();

    }
}