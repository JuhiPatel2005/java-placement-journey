public class Array {
  public static void main(String[] args) {
    int[] arr = new int[10];
    try {
      System.out.println(arr[10]);
    } catch(ArrayIndexOutOfBoundsException e){
      System.out.println("trying to access out of limit element from array" + e);
    }
  }
}
