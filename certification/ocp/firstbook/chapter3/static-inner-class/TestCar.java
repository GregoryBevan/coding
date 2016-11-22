public class TestCar {

  public static void main(String... args) {
    Car.Wheels wheels = new Car.Wheels("Goodyear");
    Car car = new Car(wheels);
    car.drive();
  }
}
