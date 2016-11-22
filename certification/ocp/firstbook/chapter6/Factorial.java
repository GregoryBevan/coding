import java.util.stream.IntStream;

public class Factorial {

  public static void main(String... args) {
    System.out.printf("Factoriel of 5 is %d",IntStream.rangeClosed(1, 5).reduce((x, y) -> x * y).getAsInt());
  }
}
