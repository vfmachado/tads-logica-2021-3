import java.util.Scanner;

public class Fatorial {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    System.out.println("Qual o numero N!?");
    int n = in.nextInt();
    int fat = 1;

    /*
      5! = 5 x 4 x 3 x 2 x 1 = 120
      7! = 7 x 6 x 5! = 5040
    */

    for (int i = 1; i <= n; i++) {
      fat = fat * i;
    }
    System.out.println("Fatorial: " + fat);
  }
}
