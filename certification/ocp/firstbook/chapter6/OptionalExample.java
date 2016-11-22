import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;
import java.util.stream.DoubleStream;
import java.util.IntSummaryStatistics;
import java.util.Arrays;

public class OptionalExample {

  public static void main(String... args) {
    System.out.println(selectHighestTemperature(Stream.of(21.2, 21.0, 23.4,34.2,23.4)));
    System.out.println(selectHighestTemperature(DoubleStream.of(21.2, 21.0, 23.4,34.2,23.4)));

   Optional<String> string =  Optional.ofNullable("bonjour");
   System.out.println(string.map(String::length));

   String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
   IntSummaryStatistics statistics = Arrays.stream(loremIpsum.split(" ")).mapToInt(String::length).summaryStatistics();
   System.out.printf("Number of words: %d%nNumber of chars: %d%nMax chars in a word: %d%nMin chars in a word: %d%nAverage numbers of chars: %f%n", statistics.getCount(), statistics.getSum(), statistics.getMax(), statistics.getMin(), statistics.getAverage());
  }

  public static Optional<Double> selectHighestTemperature(Stream<Double> temperatures) {
    return temperatures.max(Double::compareTo);
  }

  public static OptionalDouble selectHighestTemperature(DoubleStream temperatures) {
    return temperatures.max();
  }
}
