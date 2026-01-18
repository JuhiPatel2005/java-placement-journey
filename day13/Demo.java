public class Demo {
  public static void main(String[] args) throws InterruptedException {
    A t1 = new A();
    t1.start();
    B o = new B();
    Thread t2 = new Thread(o);
    t2.start();
    t1.join();
    t2.join();
    System.out.println(Thread.currentThread().getName());
    System.out.println(Thread.currentThread().getName());
  }
}
