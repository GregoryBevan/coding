public class TestLambdaFunction {

  public static void main(String... args) {
    LambdaFunction lambdaFunction = () -> System.out.println("Hello World");
    lambdaFunction.call();
  }
}
