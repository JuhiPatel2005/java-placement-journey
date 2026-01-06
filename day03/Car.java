package day03;

public class Car {
  String brand;
  String model;
  double speed;

  public Car(String brand, String model, double speed){
    this.brand = brand;
    this.model = model;
    this.speed = speed;
  }

  public void accelerate(double sp){
    speed = speed + sp;
    System.out.println("car accelerated with speedd " + speed);
  }

  public void brake(){
    if(speed == 0){
      System.out.println("Car already stopped.");
      return;
    } else {
      speed = 0;
      System.out.println("Car stopped");
    }
  }
}
