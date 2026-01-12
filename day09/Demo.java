public class Demo {
  public static void main(String[] args) {
    int age = 17;
    try {
      if(age < 18){
        throw new InvalidAgeException("Age must be greater than 18");
      }
      System.out.println("Access granted");
    } catch(InvalidAgeException e){
      System.out.println(e.getMessage());
    }
  }
}
