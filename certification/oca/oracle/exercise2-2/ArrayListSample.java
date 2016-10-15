import java.util.List;
import java.util.ArrayList;

public class ArrayListSample {

  public static void main(String... args) {
    List<Float> fishLengthList = new ArrayList<>(5);
    fishLengthList.add(10.0f);
    fishLengthList.add(15.5f);
    fishLengthList.add(18.0f);
    fishLengthList.add(29.5f);
    fishLengthList.add(45.5f);

    float requiredLength = 28.0f;

    for (Float f : fishLengthList) {
      if(requiredLength < f) {
         System.out.println(f + " ");
      }
    }
  }
}
