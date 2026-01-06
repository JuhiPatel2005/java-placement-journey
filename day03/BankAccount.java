package day03;

public class BankAccount {
  int accountNumber;
  double balance;

  public BankAccount(int accountNumber, double balance){
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public void deposit(double amount){
    if(amount > 0){
    balance = balance + amount;
     System.out.println("Deposited: " + amount + " | Current Balance: " + balance);
  } else {
    System.out.println("Invalid deposit amount.");
  }
}

  public void withdraw(double amount){
    if (amount > 0) {
    balance -= amount;
    System.out.println("Deposited: " + amount + " | Current Balance: " + balance);
    } else {
      System.out.println("Insuffiecient balance or invalid amount");
    }
  }

  public static void main(String args[]){
    BankAccount obj = new BankAccount(101,10000);
    obj.deposit(1500);
    obj.withdraw(500);
  }
}
