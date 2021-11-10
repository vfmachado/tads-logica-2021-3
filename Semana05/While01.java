import java.util.Scanner;

public class While01 {
  public static void main(String[] args) throws Exception {
    
    System.out.println("Funciona!");

    /*
    LISTA DE COMPRAS
      * OK Arroz
      * OK Feijão
      * OK Carne
      * Alface
      * Tomate
      * Guarana
      ...

    */

    Scanner in = new Scanner(System.in);

    System.out.println("Eu sei contar, ateh quanto vc quer ver?");
    int n = in.nextInt();
    int soma = 0;
    int aux = 1;
    
    while (aux <= n) {
      Thread.sleep(1000);
      soma += aux;
      System.out.println("Aux " + aux + " a soma atual eh " + soma);
      aux++; // qlqr = qlqr +1
    }

    System.out.println("Soma total: " + soma);
  }
}