public class Car {

  public static class Wheels {
    int number = 4;
    String brand;

    public Wheels(String brand) {
      this.brand = brand;
    }
  }

  Wheels wheels;

  public Car (Wheels wheels) {
    this.wheels = wheels;
  }

  public void drive() {
    System.out.println("This car runs with " + wheels.number + " " + wheels.brand + " wheels");
  }

}
