public class TestShape {

  public static void main(String... args) {
    Shape circle = new Circle(10);
    Shape square = new Square(5);

    System.out.println("Circle area: " + circle.area());
    System.out.println("Square area: " + square.area());
  }
}
