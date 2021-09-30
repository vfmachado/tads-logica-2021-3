public class OperadoresArit {

  public static void main(String[] args) {
    
    //ARTIMETICA => MATEMATICA
    /*

    +
    -
    /
    *

    % => resto de uma divisao

    (int)  5 / 3 = 1

           5 % 3 = 2

      numeros impares % 2 = 1;
      numeros pares % 2 = 0

    */
    int a = 5;
    int b = 3;
    int c = a/b;

    System.out.println("C = " + c);


    float d = 1.99f;
    System.out.println("D = " + d);

    int e = (int) d;
    System.out.println("E = " + e);

    float f1, f2, f3, f4;
    f1 = 5.0f;
    f2 = 3.0f;
    f3 = f1 % f2;
    f4 = f1 / f2;
    System.out.println("F3 = " + f3);
    System.out.println("F4 = " + f4);

    int vInt = 5;
    float vFloat = 2.0f;
    double vDouble = 2.0;
    
    int iRes = (int) (vInt/vFloat);
    float fRes = vInt/vFloat;

    System.out.println("Int Resultado: " + iRes);
    System.out.println("Float Resultado: " + fRes);


    // ORDEM ENTRE OS OPERADORES

    /*
      parenteses ()
      cast / conversao
      mult (*) e div (/)
      soma (+) e sub (-)
    */

    System.out.println("Max integer: " + Integer.MAX_VALUE);
  }

}
