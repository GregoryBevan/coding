public class ArithmeticOperators {
  public static void main(String... args) {
    ArithmeticOperators operators = new ArithmeticOperators();
    operators.plus(5, 10);
    operators.modulus(5, 10);
    operators.modulus(5.0, 10.0);
  }

  public void plus(int x,  int y) {
    System.out.println("x + y = " + (x+y));
    System.out.println("x + y = " + x+y);
  }

  public void modulus(int x,  int y) {
    System.out.println("x % y = " + (x%y));
    System.out.println("x % y = " + x%y);
  }

  public void modulus(double x,  double y) {
    System.out.println("x % y = " + (x%y));
    System.out.println("x % y = " + x%y);
  }
}
