import java.util.Scanner;

public class Break {
  public static void main(String[] args) {
    
    /*
      LACOS DE REPETICAO ELES PODEM FORCADAMENTE SEREM CONTINUADOS OU PARADOS
    */

    // mostra todos pares de 0 a n ou de 0 a 15 (caso n seja > que 15)
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    //   inicializacao   teste logico   "passo" / mudanca
    for (int i = 0; i <= n; i++) {
      System.out.print(i);

      if (i % 2 == 0)
        System.out.println(" eh par");
      else
        System.out.println();

      // se o valor de i for igual a 15, para o laco de repeticao
      if (i == 15) {
        break;
      }
    }

  }
}
