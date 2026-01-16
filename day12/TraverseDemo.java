import java.util.ArrayList;
import java.util.Iterator;

public class TraverseDemo {
  public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(10);
    nums.add(20);
    nums.add(30);
    nums.add(40);
    nums.add(50);

    Iterator<Integer> it = nums.iterator();
    while(it.hasNext()){
      Integer num = it.next();
      System.out.println(num);
    }

    for(int n : nums){
      System.out.println(n);
    }

    nums.forEach(n -> System.out.println(n));
  }
}