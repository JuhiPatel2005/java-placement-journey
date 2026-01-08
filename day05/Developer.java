package day05;

public class Developer extends Employee{
  String ProgrammingLanguage;

  public Developer(int id, String name, double salary, String pl){
    super(id, name, salary);
    this.ProgrammingLanguage = pl;
  }

  public void displayDetails(){
    super.displayDetails();
    System.out.println("Programming Langage: " + ProgrammingLanguage);
  }
  
}
