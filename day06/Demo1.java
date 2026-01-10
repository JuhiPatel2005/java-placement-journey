public class Demo1 {
  public static void main(String[] args) {
    Payment p1 = new CreditCard();
    Payment p2 = new UPIPayment();
    p1.pay();
    p2.pay();
  }
}
