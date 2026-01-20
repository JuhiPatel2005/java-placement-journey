public class BankAccount {
  private int balance = 100;

  public synchronized void withdraw(String threadName, int amount){
    if(balance >= amount){
      System.out.println(threadName + " is going to withdraw " + amount);
      try {
        Thread.sleep(100);
      } catch(InterruptedException e){
        e.printStackTrace();
      }
      balance -= amount;
      System.out.println("withdrawal completed. current balance : " + balance);
    } else {
      System.out.println("insufficient bank balance");
    }
  }
}