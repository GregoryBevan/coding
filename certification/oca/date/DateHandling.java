import java.time.LocalDate;
import java.time.Month;

public class DateHandling {
  public static void main(String... args) {
    LocalDate date = LocalDate.of(2016, Month.JANUARY, 31);
    System.out.println("First date : " + date);
    date = date.plusMonths(1);
    System.out.println("Second date : " + date);
    date = date.plusMonths(1);
    System.out.println("Third date : " + date);
    date = date.plusMonths(1);
    System.out.println("Fourth date : " + date);
  }
}
