//Criando uma classe e seus atributos privados
public class Manhwa { 
    private String titulo;
    private String autor;
    protected int paginas;
    private boolean disponivel;
    private static int totalCadastrado; //Aqui criei um atributo estático que é incrementado o total de obras cadastradas

    //criando encadeamento de construtores
    public Manhwa(String titulo, String autor){
    this(titulo,autor,  0,  true);
    }

    public Manhwa(String titulo, String autor, int paginas){
        this(titulo, autor, paginas, true);
    }

    public Manhwa(String titulo, String autor, int paginas, boolean disponivel){
        this.titulo = titulo;
        this.autor = autor;
        if (paginas <0){   //Validando número de páginas, esses número não podem ser negativos, então substituimos por 0 seu número 
            paginas = 0  ;
        }
        this.paginas = paginas;
        this.disponivel = disponivel;
        totalCadastrado++;
    }

    public static int gettotalCadastrado(){   //Aqui criei um get para ler o atributo estático do total de obras cadastradas
           return totalCadastrado;
    }

    boolean emprestar(){  //Método que tenta emprestar o manhwa, retorna true se conseguiu e false se já estava emprestado.
        if (disponivel == true){
            disponivel = false;
            return true ;
        }else{
            return false;
        }
    }

    //Sobrescrevendo um método existente:
    @Override 
    public String toString(){
        return "Título: " + titulo + " |Autor: " + autor + " |Quantidade de páginas da obra: " + paginas + " |Disponibilidade: " + disponivel;
    }
}
