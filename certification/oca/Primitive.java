public class Primitive {

  public void showIntRange() {
    System.out.println("int min : "+ Integer.MIN_VALUE + " - int max : " + Integer.MAX_VALUE);
  }
  public void showShortRange() {
    System.out.println("short min : "+ Short.MIN_VALUE + " - short max : " + Short.MAX_VALUE);
  }
  public void showLongRange() {
    System.out.println("long min : "+ Long.MIN_VALUE + " - long max : " + Long.MAX_VALUE);
  }
  public void showFloatRange() {
    System.out.println("float min : "+ Float.MIN_VALUE + " - float max : " + Float.MAX_VALUE);
  }
  public void showDoubleRange() {
    System.out.println("double min : "+ Double.MIN_VALUE + " - double max : " + Double.MAX_VALUE);
  }
  public void showByteRange() {
    System.out.println("byte min : "+ Byte.MIN_VALUE + " - byte max : " + Byte.MAX_VALUE);
  }
  public void showCharRange() {
    System.out.println("char min : "+ Character.MIN_VALUE + " - char max : " + Character.MAX_VALUE);
  }

  public static void main(String... args) {
    Primitive primitive = new Primitive();
    primitive.showShortRange();
    primitive.showIntRange();
    primitive.showFloatRange();
    primitive.showLongRange();
    primitive.showDoubleRange();
    primitive.showByteRange();
    primitive.showCharRange();
  }
}
