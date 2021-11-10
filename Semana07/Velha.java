import java.util.Scanner;

public class Velha {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int p1 = 0, p2 = 0, p3 = 0,
        p4 = 0, p5 = 0, p6 = 0,
        p7 = 0, p8 = 0, p9 = 0;

    int jog = 1;

    while (true) {

      System.out.printf("\n"+
        "%d | %d | %d \n"+
        "--------- \n"+
        "%d | %d | %d \n"+
        "--------- \n"+
        "%d | %d | %d \n",
        p1, p2, p3, p4, p5, p6, p7, p8, p9
      );

      System.out.println("\nVez do jogador " + jog);
      int pos = in.nextInt();

      if (pos == 1) {
        p1 = jog;
      }
      if (pos == 2) {
        p2 = jog;
      }
      if (pos == 3) {
        p3 = jog;
      }
      if (pos == 4) {
        p4 = jog;
      }
      if (pos == 5) {
        p5 = jog;
      }
      if (pos == 6) {
        p6 = jog;
      }
      if (pos == 7) {
        p7 = jog;
      }
      if (pos == 8) {
        p8 = jog;
      }
      if (pos == 9) {
        p9 = jog;
      }

      if (p1 == p2 && p2 == p3 && p1 != 0) {
        break;
      }

      if (jog == 1)
        jog = 2;
      else
        jog = 1;

    }

    System.out.println("Vencedor jogador " + jog);

  }
}
