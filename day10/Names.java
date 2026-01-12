import java.util.ArrayList;

public class Names {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("Juhi");
    names.add("Alice");
    names.add("Bob");
    names.add("Shivani");
    names.add("Riya");
    names.remove("Alice");

    for(String name : names){
      System.out.println(name);
    }

    String search = "Shivani";
    for(int i = 0; i < names.size(); i++){
      if(names.get(i).equals(search) ){
        System.out.println("found at index " + i);
      }
    }
  }
}