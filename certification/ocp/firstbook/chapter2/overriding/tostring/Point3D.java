class Point3D extends Point2D{
 private  int z;

  public Point3D(int x, int y, int z) {
    super(x, y);
    this.z = z;
  }

  @Override
  public boolean equals(Object other) {
    System.out.println(1);
    //super.equals(other);
    if(other instanceof Point3D) {
      Point3D point = (Point3D) other;
      System.out.prinln("Point3D");
      if(this.z == point.z) {
        return true;
      }
    }
    return false;
  }
}
