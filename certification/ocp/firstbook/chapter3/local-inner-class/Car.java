public class Car {

  public void drive() {
    class Wheels {
      int number = 4;
      String brand;

      Wheels(String brand) {
        this.brand = brand;
      }
    }
    Wheels wheels = new Wheels("Michelin");
    System.out.println("This car runs with " + wheels.number + " " + wheels.brand + " wheels");
  }

  public static void main(String... args) {
      Car car = new Car();
      car.drive();
  }

}
