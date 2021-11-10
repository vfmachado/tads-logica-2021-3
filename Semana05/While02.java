import java.util.Scanner;

public class While02 {
  public static void main(String[] args) throws Exception {
  
    /*
    ESTRUTURAS DE REPETICAO

    DETERMINADAS
      --> SABEMOS QUANTAS VEZES ELA VAI REPETIR
        ONDE USUARIO DETERMINA ESSE VALOR
        EH UM VALOR FIXO, POR EX 5x

    INDETERMINADAS
      --> NAO TEM CERTEZA QUANTAS VEZES VAI REPETIR
        QUANDO DEPENDE, A CADA REPETICAO DO INPUT DO USUARIO
        SISTEMA ALEATORIO
    */

    Scanner in = new Scanner(System.in);

    // programa que mostre o nome do usuário 15x   DETERMINADA

    // programa que mostre o nome do usuário a 
    // quantidade de vezes que o usuario determinar   DETERMINADA

    // programa que mostre o nome do usuário até que um valor aleatório,
    // selecionado pelo usuário seja sorteado     INDETERMINADA

    // programa que mostre o nome do usuario 2x a quantidade selecionada
    // pelo usuario       DETERMINADA


    
    System.out.println("Informe seu nome");
    String nome = in.next();

    //DETERMINADA 5x
    int inicial = 1;
    while (inicial <= 5) {
      System.out.println("Contando ate 5 ... " + inicial + ": " + nome);
      inicial++;
    }

    System.out.println("\n\nQuantas vezes deseja repetir");
    int n = in.nextInt();
    inicial = 1;
    while (inicial <= n) {
      System.out.println("Contando ate N ... " + inicial + ": " + nome);
      inicial++;
    }
    

    // ESTRUTURA INDETERMINADA  (NAO DETERMINADA)
    int i = 7;
    System.out.println("\n\nInforme um segredo para comecar");
    int segredo = in.nextInt();
    while (segredo != i) {
      System.out.println("ixiii " + nome);
      System.out.println("Errou, tente de novo o segredo");
      segredo = in.nextInt();
    }



    // DESAFIO - JOGO DA VELHA COM 9 VARIAVEIS, 2 JOGADORES, E UMA ESTRUTURA DE REPETICAO INDETERMINADA
  }
}