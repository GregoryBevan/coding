import java.time.LocalDate;
import java.time.Month;
import java.time.LocalTime;

public class DateAndTime {
  public static void main(String... args) {
    System.out.println("Current date : " + LocalDate.now());
      System.out.println("My birthday : " + LocalDate.of(1979, Month.JUNE, 18));
      System.out.println("Current time :" + LocalTime.now());

      System.out.println("Precise time : " + LocalTime.of(22,51,15, 1));
  }

}
