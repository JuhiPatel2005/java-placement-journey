package day05;

public class Demo1 {
  public static void main(String args[]){
    Vehicle v = new Vehicle();
    Car c = new Car();
    ElectricCar e = new ElectricCar();
    System.out.println("Vehicle fuel type: ");
    v.fuelType();
     System.out.println("car fuel type: ");
    c.fuelType();
     System.out.println("ElectricCar fuel type: ");
    e.fuelType();
  }
}
