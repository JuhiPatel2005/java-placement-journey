public class Demo {
  public static void main(String[] args) {
    Calculator c = (i, j) ->  i+j;

    int result = c.add(5,6);
    System.out.println(result);
  }
}
