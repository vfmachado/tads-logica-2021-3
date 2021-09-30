public class OperadoresRel {
  
  public static void main(String[] args) {
    
    /*
    operadores logicos

    variavel do tipo boolean
      true
      false
    
    E &&
    V e V => V
    V e F => F
    F e V => F
    F e F => F
    
    OU ||
    V ou V => V
    V ou F => V
    F ou V => V
    F ou F => F

    NOT !
    NOT V => F
    NOT F => V

    */
    boolean vouf;
    vouf = true;
    vouf = false;

    boolean ex = true && true;
    System.out.println("Ex " + ex);


  }

}
