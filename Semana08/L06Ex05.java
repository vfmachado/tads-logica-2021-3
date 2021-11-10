import java.util.Scanner;

public class L06Ex05 {
  public static void main(String[] args) {
    //APROXIMACAO DE E^X

    Scanner in = new Scanner(System.in);
    System.out.println("Informe o valor de x");
    float x = in.nextFloat();

    float soma = 0;

    for (int i = 0; i < 14; i++) {
      System.out.println("\n\ntermos:");

      System.out.println("numerador");
      System.out.println("\tbase: " + x);
      System.out.println("\texpoente: " + i);
      
      float numerador = 1;
      for (int exp = 0; exp < i; exp++) {
        numerador = numerador * x;
      }

      System.out.println("denominador");
      System.out.println("\tfatorial de " + i);

      float denominador = 1;
      for (int valor = 1; valor <= i; valor++) {
        denominador = denominador * valor;
      }

      float termo = numerador/denominador;

      System.out.println("numerador: " + numerador);
      System.out.println("denominador: " + denominador);
      System.out.println("Resultado do Termo " + termo);

      soma = soma + termo;
      
    }

    System.out.println("Aprox por soma: " + soma);
  }
}
