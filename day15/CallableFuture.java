import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFuture {
  public static void main(String[] args) {
    ExecutorService executor = Executors.newFixedThreadPool(1);
    Callable<Integer> task = () -> {
      int a = 10;
      int b = 20;
      return a + b;
    };

    Future<Integer> future = executor.submit(task);
    try {
      Integer result = future.get();
      System.out.println("sum = "+ result);
    } catch(InterruptedException | ExecutionException e){
      e.printStackTrace();
    }
    executor.shutdown();
  }
}
