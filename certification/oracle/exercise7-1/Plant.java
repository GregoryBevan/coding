public abstract class Plant {
  private int age = 0;
  private int height = 0;

  public int getAge() {
    return this.age;
  }

  public void addYearToAge() {
    this.age++;
  }

  public int getHeight() {
    return this.height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public abstract void doSpring();
  public abstract void doSummer();
  public abstract void doFall();
  public abstract void doWinter();
}
