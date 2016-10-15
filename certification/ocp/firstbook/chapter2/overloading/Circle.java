public class Circle {
  public void fillColor(int red, int green, int blue) {
    System.out.println("RGB: " + red + "-" + green + "-" + blue);
  }

  public void fillColor(float hue, float saturation, float brightness) {
    System.out.println("HSB: " + hue + "-" + saturation + "-" + brightness);
  }

  public static void main(String... args) {
    Circle circle = new Circle();
    circle.fillColor(5,100,34);
    circle.fillColor(0.1f, 0.5f, 0.3f);
  }
}
