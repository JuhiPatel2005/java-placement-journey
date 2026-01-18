public class A extends Thread {
  public void run(){
    System.out.println("In class A");
    try {
      sleep(5);
    } catch(InterruptedException e){
      e.printStackTrace();
    }
  }
}