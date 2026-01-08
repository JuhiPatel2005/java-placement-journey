package day05;

public class Employee {
  int id;
  String name;
  double salary;

  public Employee(int id, String name, double salary){
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public void displayDetails(){
    System.out.println("id= " + id + " name= " + name + " salary=  " + salary);
  }
}
