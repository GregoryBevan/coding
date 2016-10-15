class Point2D {
  int x;
  int y;

  public Point2D(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public boolean equals(Object other) {
    if(other == null) {
      return false;
    }
    System.out.println(1);
    if(other instanceof Point2D) {
      Point2D point = (Point2D) other;
      if(this.x == point.x && this.y == point.y) {
        return true;
      }
    }
    return false;
  }
}
