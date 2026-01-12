public class Zero {
  public static void main(String[] args) {
    int i = 10;
    int j = 0;
    int r = 0;
    try {
       r = i / j;
       System.out.println("value of r is " + r);
    } catch(ArithmeticException e){
      System.out.println("Divide by zero ." + e);
    }
    
  }
}