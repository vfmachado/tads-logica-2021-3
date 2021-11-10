import java.util.Scanner;

public class L04Ex01 {
  public static void main(String[] args) {
    /*
    Ler um número inteiro n. Escrever a soma de todos os números de 1 até n.
    */
    Scanner in = new Scanner(System.in);
    System.out.println("Informe o valor n");
    int n = in.nextInt(); //declarando e lendo na mesma linha

    int a = 1;
    int soma = 0;

    while (a <= n) { // enquanto o valor de a for menor ou igual a n ...
      soma += a;
      System.out.println(a);
      a++;
    }

    System.out.println("Soma total: " + soma);
  }
}
