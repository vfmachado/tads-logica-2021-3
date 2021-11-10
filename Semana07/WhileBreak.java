import java.util.Scanner;

public class WhileBreak {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    boolean continua = true;
    while (continua) {

      int a = in.nextInt();

      if (a == 7) {
        continua = false;
      }

    }
    
  }
}
