import java.util.List;
import java.util.Arrays;


public class MethodReferenceExample {

  public void display(String word) {
    System.out.println(word);
  }

  public void display(TwoParamerters twoParamerters) {
    twoParamerters.print("Hello", "World");
  }

  public static void main(String... args) {
    List<String> words = Arrays.asList("Hello", "My", "Sweet", "Darling");
    MethodReferenceExample methodReferenceExample = new MethodReferenceExample();
    words.forEach(methodReferenceExample::display);
    TwoParamerters twoParamerters = (firstParameter, secondParameter) -> System.out.println(firstParameter + " "  + secondParameter);
    methodReferenceExample.display(twoParamerters);

  }

  @FunctionalInterface
  public interface TwoParamerters {

      void print(String firstParameter, String secondParameter);

  }
}
