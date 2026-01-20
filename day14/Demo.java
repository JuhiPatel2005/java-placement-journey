public class Demo {
  public static void main(String[] args) {
    BankAccount account = new BankAccount();

    Runnable task = () -> account.withdraw(Thread.currentThread().getName(), 60);

    Thread t1 = new Thread(task, "Thread-1");
    Thread t2 = new Thread(task, "Thread-2");

    t1.start();
    t2.start();
  }
}
