public class Runner {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.insert(5);
    list.insert(12);
    list.insert(60);
    list.insertAt(2, 20);
    list.insert(10);
    
    list.show();
  }
}
