public class aulastalles{
    public static void main(String[] args){
        boolean is_professor = true; //is indica que a variavel é boleanp
         System.out.print("mAyke é proff?" + is_professor);
         System.out.print("");
         //int idade;
         String nome = "joão";
         String nome2 = "maria";

         String sobrenome = "santos";
         System.out.print("nome completo: " + nome + "" + sobrenome ); //colocar esse + se chama concatenar e as aspas são para dar espaço
         System.out.print("nome completo: " + nome.concat(sobrenome)); //(concat é uma função que concatena ). maioria das linguagens não tem esse concat
         
         System.out.print(nome.equals(nome2)); //compara as duas variaveis pra saberem se são iguais
          System.out.print(nome.equalsIgnoreCase(nome2));//ignora variações entre letras maiuscula e minuscula
          System.out.print(nome.length()); //para validar e saber quantidade de caracteres
          System.out.print(nome);
          String nome3 = "talles";
          //String nome4 = "talles pacheco";
            System.out.println(nome3);
            System.out.println(nome3.trim());//remove espaços em branco
            System.out.println(nome3.toLowerCase());//deixa tudo na string em minusculo
              System.out.println(nome3.toUpperCase());//deixa tudo na sreing em maiusculo
          //  System.out.println(nome4.replace(target:"talles", replacente:"pacheco"));//pra substituir uma string por outra
                     //   System.out.println(nome4.split(regex:" "));//ele quebra o array em algumas novas string, e vc diz a ele onde ele deve quebrar



    }

}