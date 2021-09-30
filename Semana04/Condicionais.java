import java.util.Scanner;

public class Condicionais {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    int idade;

    System.out.println("Bem vindo ao meu primeiro programa identificador de maioridade, utilize para saber se ja pode tirar a carteira de motorista...");

    System.out.println("Informe sua idade");
    idade = in.nextInt();
    
    boolean ehMaior = idade >= 18;
    System.out.println("Eh maior? " + ehMaior);

   
    /*

      ESTRUTURAS DE CONTROLE

      * CONDICAO

      se valor_logico entao
        trecho codigo
      fim-se

      if ( valor_logico ) {
        // code
      } 


      // se (if) ... senao (else)
      if ( valor_logico ) {
        //bloco de codigos que executa se o valor_logico eh verdadeiro
      } else { 
        //bloco de codigos que executa se o valor_logico NNNAAAAOOOO eh verdadeiro
      }


      // se ... senao se ... senao se .. senao
      if (teste1) {
        
      } else {
        if (teste2) {

        } else {
          if (teste3) {
           
          } else {
          
          }
        } 
      }



      if (teste1) {
        
      } else if (teste2) {

      } else if (teste3) {
          
      } else {    /* OPCIONAL
      
      }
            


      * REPETICAO


    */

    // if (ehMaior) {
    //   System.out.println("Sim, vc ja pode comecar o processo");
    // }

    // if (!ehMaior) {
    //   int faltam = 18 - idade;
    //   System.out.println("Ooops, ainda faltam " + faltam + " anos para vc tirar usa habilitacao");
    // }

    if (ehMaior) {
      System.out.println("Sim, vc ja pode comecar o processo");
    } else {
      int faltam = 18 - idade;
      System.out.println("Ooops, ainda faltam " + faltam + " anos para vc tirar usa habilitacao");
    }
  }
}
