package day05;

public class Demo {
  public static void main(String args[]){
    Employee emp = new Employee(101, "Alice", 50000);
    Developer dev = new Developer(102,"bob", 70000, "Java");

    Employee emp1 = new Developer(103,"alice1", 40000, "Python");

    System.out.println("Employee Details: ");
    emp.displayDetails();
    System.out.println("\nDeveloper Deatails: ");
    dev.displayDetails();
    System.out.println("\nEmployee1 details: ");
    emp1.displayDetails();
  }
}
