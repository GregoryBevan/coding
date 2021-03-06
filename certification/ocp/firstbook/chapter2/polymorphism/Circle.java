class Circle extends Shape {
  private int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  public double area() {
    return Math.PI * radius * radius;
  }
}
