public class ExFor {
  public static void main(String[] args) {
    /*
    ESTRUTURAS DE
      CONTROLE
        IF / ELSE / SWITCH CASE
      REPETICAO
        WHILE (enquanto) / DO ... WHILE (faz ... enquanto) / FOR (para)
    */

    /*
    ex: ler um arquivo
      while (nao chegar no final do arquivo) {
        // vou fazer alguma coisa
      }

      ===

      do {
        // vou fazer alguma coisa
      } while(nao chegar no final do arquivo);
    */

    /*
    ex: ler 10 notas
        ir do numero 100 até 1
        ... (muito Determinada)

      * eu sei onde comecar
      * eu sei de quanto em quanto eu quero mudar 
      * eu sei onde quero parar

      for (inicio; teste; mudanca) {
        // vou fazer alguma coisa
      }

    */
    //mostrar os numeros de 1 a 5
    for (int i = 1; i <= 5; i++) {  //i++ === i=i+1     // i--
      System.out.println(i);
    }

    //mostrar os valores pares de 20 a 0
    for (int a = 20; a >= 0; a = a-2) {  //a -= 2
      System.out.println(a);
    }

    for (int b = 0; ; b++) {
      System.out.println(b);
      if (b == 1000) break;
    }
  
  }  
}
