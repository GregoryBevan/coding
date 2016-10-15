import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Exercise {
  public static void main(String... args) {
    double[] lastSevenDaysTemp = {28, 23.2, 21.7, 21.4, 20.9, 22, 21.4 };
    double totalTemp = 0;
    for(double temp : lastSevenDaysTemp) {
      totalTemp += temp;
    }
    System.out.println("Average from array : " + (totalTemp/7));
    List<Double> lastSevenDaysTempList = new ArrayList<>(7);
    lastSevenDaysTempList.add(28.0);
    lastSevenDaysTempList.add(23.2);
    lastSevenDaysTempList.add(21.7);
    lastSevenDaysTempList.add(21.4);
    lastSevenDaysTempList.add(20.9);
    lastSevenDaysTempList.add(22.0);
    lastSevenDaysTempList.add(21.4);
    System.out.println("Average from arraylist : " + (lastSevenDaysTempList.stream().mapToDouble(Double::doubleValue).sum() / 7));
  }
}
