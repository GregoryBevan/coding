import java.util.List;
import java.util.ArrayList;

public class GenericListFiller {

  private static <T> void fill(List<T> list, T val) {
    for(int i = 0; i < list.size(); i++) {
      list.set(i, val);
    }
  }

  public static void main(String... args) {
    List<String> listStr = new ArrayList<>();
    listStr.add("Hello");
    listStr.add("World");
    System.out.println(listStr);
    fill(listStr, "MyAss");
    System.out.println(listStr);
  }
}
