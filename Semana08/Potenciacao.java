import java.util.Scanner;

public class Potenciacao {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    int base, exp;

    System.out.println("informe o valor da base e do expoente");
    base = in.nextInt();
    exp = in.nextInt();
    // base^exp = base * base * base * base ... (tantas vezes quanto o expoente indicar)

    // base^0 = 1

    // 5^4 ==> 5 x 5 x 5 x 5
    //      i  0   1   2   3   < exp
    int pot = 1;

    for (int i = 0; i < exp; i++) {
      pot = pot * base;
    }
    System.out.println("Potencia: " + pot);

  } 
}
