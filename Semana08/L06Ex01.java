import java.util.Scanner;

public class L06Ex01 {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    int femininoConcursado = 0;
    int masculinos = 0;

    while (true) {
      System.out.println("Informe a matricula");
      int matricula = in.nextInt();

      if (matricula == 0) break;  /// PARAAAA O LAÇO (vai para a proxima linha depois do laco)

      int idade;
      char genero;
      float altura; //em metros
      boolean concursado;

      System.out.print("Idade: ");
      idade = in.nextInt();

      System.out.print("Genero (m/f): ");
      genero = in.next().charAt(0);

      System.out.print("Altura (m): ");
      altura = in.nextFloat();

      System.out.println("Concursado: ");
      concursado = in.nextBoolean();

      //A
      if (genero == 'f' && concursado) femininoConcursado++;

      //B
      if (genero == 'm') masculinos++;

      //CONTINUA...
    }
    //essa é a proxima linha

    System.out.println("a) " + femininoConcursado);
    System.out.println("b) " + masculinos);
  }
}
