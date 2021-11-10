import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    Random random = new Random();

    int aleatorio = random.nextInt(100) + 1;
    int escolhido = 0;
    int tentativas = 0;

    while (escolhido != aleatorio) {
      System.out.println("Escolha um numero");
      escolhido = in.nextInt();
      tentativas++;

      if (escolhido < aleatorio) {
        System.out.println("Chuta mais alto");
      } else if (escolhido > aleatorio) {
        System.out.println("tenta um valor menor");
      }

    }
    
    System.out.println("Voce precisou de " + tentativas + " para acertar o numero " + aleatorio);

  }  
}
