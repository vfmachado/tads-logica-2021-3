import java.util.Scanner;

public class PlanoNetFlix {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    int quantTelas = in.nextInt();

    if (quantTelas == 1) {
      System.out.println("Plano pessoal");
    } else if (quantTelas < 4) {
      System.out.println("Plano casa");
    } else if (quantTelas <= 8) {
      System.out.println("Plano amigo de todos");
    } else {
      System.out.println("Enterprise, converse com nossos atendentes");
    }

  }
}
