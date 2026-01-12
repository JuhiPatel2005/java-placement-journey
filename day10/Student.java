import java.util.HashMap;

public class Student {
  public static void main(String[] args) {
    HashMap<Integer, String> students = new HashMap<>();
    students.put(1,"Juhi");
    students.put(2,"Alice");
    students.put(3,"Bob");

    System.out.println(students.get(2));

    for(Integer key: students.keySet()){
      System.out.println("key: " +key + " Value: " + students.get(key));
    }
  }
}
