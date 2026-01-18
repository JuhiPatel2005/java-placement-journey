public class B extends Thread {
  public void run(){
    System.out.println("In class B");
    try {
      sleep(5);
    } catch(InterruptedException e){
      e.printStackTrace();
    }
  }
}