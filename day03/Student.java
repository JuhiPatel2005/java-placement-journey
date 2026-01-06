package day03;
public class Student {
  int id;
  String name;
  int marks;

  public Student(int id, String name, int marks){
      this.id = id;
      this.name = name;
      this.marks = marks;
  }

  public void displayDetails(){
    System.out.println("id = " + id + " name = " + name + " marks = " + marks);
  }
}