public final class Counter {
  static int count;
  final double PI = 3.14;

  final void show(){
    System.out.println("In parent class");
  }

  public Counter(){
    count++;
  }

}