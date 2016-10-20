package graphicsshape;

import graphicsshape.Shape;

public class Circle extends Shape {
  private int radius;

  public void area() {
    System.out .println("area: " + Math.PI * radius * radius);
  }

  void fillColor() {
    System.out.println("color: " + color);
  }
}
