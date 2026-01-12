public class NullPointer {
  static int[] arr ;
  public static void main(String[] args) {
    
    try {
      System.out.println(arr[0]);
    } catch(NullPointerException e){
      System.out.println("null pointer exception" + e);
    }
  }
}
