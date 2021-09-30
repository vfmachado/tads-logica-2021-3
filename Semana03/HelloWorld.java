import java.util.Scanner;

public class HelloWorld {

  public static void main(String[] args) {

    //VARIAVEIS
    //TIPO NOME
    String nomeDaPessoa;
    int idade;

    Scanner in = new Scanner(System.in);

    System.out.println("Hello World!!!");
    System.out.println("Bem vindo ao meu primeiro programa");
    
    System.out.println("Qual seu nome?");
    nomeDaPessoa = in.next(); // utiliza o scanner para ler uma palavra
    
    System.out.println("Bahh!!! que massa " + nomeDaPessoa 
      + " ... bem vindo ao mundo da programacao");

    System.out.println("Eii " + nomeDaPessoa 
    + ", desculpas a indelicadeza, qual a sua idade?");
    idade = in.nextInt();

    int dobro = idade * 2;

    System.out.println("A verdade eh que tanto faz " +  idade + " ou " + dobro + " anos para programar!");


    //DECLARACAO DE VARIAVEL COM INICIALIZAÇÃO
    // float preco;
    // preco = 1000.0f;
    float preco = 1000.0f;
    
    
    // float acrescimo = 0.2f * preco;
    // float total = preco + acrescimo;

    float total = preco * 1.2f;

    /*
    if / else
    operadores aritmeticos
    operadores logicos e relacionais
    */


    // javascript (console.log)
    // python (print)
    // php echo
    // c printf
    // c++ std::cout
    // ... cada linguagem tem uma palavra chave para executar o "mesmo comando"
    // saida (mostrar algo na tela)
  }

} 
